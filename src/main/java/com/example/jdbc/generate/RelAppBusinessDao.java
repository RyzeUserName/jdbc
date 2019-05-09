package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 *  dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class RelAppBusinessDao extends BaseDao<RelAppBusiness> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 实体
     * @param entity 实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveRelAppBusiness(RelAppBusiness entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO rel_app_business ( app_id,app_name,business_code,")
            .append("business_name,trade_code,trade_name,message_queue,status,type,")
            .append("pay_type,account_balance_change,delete_flag,creator,create_time,")
            .append("operate_time ) VALUES (  :appId, :appName, :businessCode,")
            .append(" :businessName, :tradeCode, :tradeName, :messageQueue, :status,")
            .append(" :type, :payType, :accountBalanceChange, :deleteFlag, :creator,")
            .append(" :createTime, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateRelAppBusiness(RelAppBusiness entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE rel_app_business SET app_id = :appId,app_name = :appName,")
            .append("business_code = :businessCode,business_name = :businessName,")
            .append("trade_code = :tradeCode,trade_name = :tradeName,")
            .append("message_queue = :messageQueue,status = :status,type = :type,")
            .append("pay_type = :payType,account_balance_change = :accountBalanceChange,")
            .append("delete_flag = :deleteFlag,creator = :creator,")
            .append("create_time = :createTime,operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public RelAppBusiness getRelAppBusinessById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT rab.id,rab.app_id,rab.app_name,rab.business_code,")
            .append("rab.business_name,rab.trade_code,rab.trade_name,rab.message_queue,")
            .append("rab.status,rab.type,rab.pay_type,rab.account_balance_change,")
            .append("rab.delete_flag,rab.creator,rab.create_time,rab.operate_time")
            .append(" FROM rel_app_business rab WHERE rab.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(RelAppBusiness.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteRelAppBusinessById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM rel_app_business WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
