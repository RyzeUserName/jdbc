package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 账户类型控制 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizAccountControlDao extends BaseDao<BizAccountControl> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 账户类型控制实体
     * @param entity 账户类型控制实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizAccountControl(BizAccountControl entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_account_control ( type_code,type_name,")
            .append("internal_external,fee_type,account_body_type,account_body_name,")
            .append("recharge_flag,withdraw_flag,pay_flag,refund_flag,transfer_in_flag,")
            .append("transfer_out_flag,overdraft_flag,freeze_flag,remark,creator,")
            .append("create_time,operator,operate_time,delete_flag ) VALUES (  :typeCode,")
            .append(" :typeName, :internalExternal, :feeType, :accountBodyType,")
            .append(" :accountBodyName, :rechargeFlag, :withdrawFlag, :payFlag,")
            .append(" :refundFlag, :transferInFlag, :transferOutFlag, :overdraftFlag,")
            .append(" :freezeFlag, :remark, :creator, :createTime, :operator,")
            .append(" :operateTime, :deleteFlag )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 账户类型控制实体
     * @param entity 账户类型控制实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizAccountControl(BizAccountControl entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_account_control SET type_code = :typeCode,")
            .append("type_name = :typeName,internal_external = :internalExternal,")
            .append("fee_type = :feeType,account_body_type = :accountBodyType,")
            .append("account_body_name = :accountBodyName,recharge_flag = :rechargeFlag,")
            .append("withdraw_flag = :withdrawFlag,pay_flag = :payFlag,")
            .append("refund_flag = :refundFlag,transfer_in_flag = :transferInFlag,")
            .append("transfer_out_flag = :transferOutFlag,overdraft_flag = :overdraftFlag,")
            .append("freeze_flag = :freezeFlag,remark = :remark,creator = :creator,")
            .append("create_time = :createTime,operator = :operator,")
            .append("operate_time = :operateTime,delete_flag = :deleteFlag WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取账户类型控制详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizAccountControl getBizAccountControlById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bac.id,bac.type_code,bac.type_name,bac.internal_external,")
            .append("bac.fee_type,bac.account_body_type,bac.account_body_name,")
            .append("bac.recharge_flag,bac.withdraw_flag,bac.pay_flag,bac.refund_flag,")
            .append("bac.transfer_in_flag,bac.transfer_out_flag,bac.overdraft_flag,")
            .append("bac.freeze_flag,bac.remark,bac.creator,bac.create_time,bac.operator,")
            .append("bac.operate_time,bac.delete_flag FROM biz_account_control")
            .append(" bac WHERE bac.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizAccountControl.class, sql.toString(), params);
    }

    /**
     * 删除账户类型控制
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizAccountControlById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_account_control WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
