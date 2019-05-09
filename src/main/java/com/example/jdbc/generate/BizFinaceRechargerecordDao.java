package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 充值记录 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizFinaceRechargerecordDao extends BaseDao<BizFinaceRechargerecord> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 充值记录实体
     * @param entity 充值记录实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizFinaceRechargerecord(BizFinaceRechargerecord entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_finace_rechargerecord ( recharge_number,account_code,")
            .append("recharge_amount,account_number_code,recharge_picture,remark,creator,")
            .append("create_time,operator,operate_time,delete_flag ) VALUES ( ")
            .append(" :rechargeNumber, :accountCode, :rechargeAmount, :accountNumberCode,")
            .append(" :rechargePicture, :remark, :creator, :createTime, :operator,")
            .append(" :operateTime, :deleteFlag )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 充值记录实体
     * @param entity 充值记录实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizFinaceRechargerecord(BizFinaceRechargerecord entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_finace_rechargerecord SET ")
            .append("recharge_number = :rechargeNumber,account_code = :accountCode,")
            .append("recharge_amount = :rechargeAmount,")
            .append("account_number_code = :accountNumberCode,")
            .append("recharge_picture = :rechargePicture,remark = :remark,")
            .append("creator = :creator,create_time = :createTime,operator = :operator,")
            .append("operate_time = :operateTime,delete_flag = :deleteFlag WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取充值记录详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizFinaceRechargerecord getBizFinaceRechargerecordById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bfr.id,bfr.recharge_number,bfr.account_code,")
            .append("bfr.recharge_amount,bfr.account_number_code,bfr.recharge_picture,")
            .append("bfr.remark,bfr.creator,bfr.create_time,bfr.operator,bfr.operate_time,")
            .append("bfr.delete_flag FROM biz_finace_rechargerecord bfr WHERE bfr.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizFinaceRechargerecord.class, sql.toString(), params);
    }

    /**
     * 删除充值记录
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizFinaceRechargerecordById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_finace_rechargerecord WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
