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
public class BasicPaymentConfigurationDao extends BaseDao<BasicPaymentConfiguration> {
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
    public int saveBasicPaymentConfiguration(BasicPaymentConfiguration entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment_configuration ( app_id,app_name,secret,")
            .append("status,business_scene,business_type,account_type,account,")
            .append("account_name,account_balance_change,trade_type,pay_type,inner_flow,")
            .append("message_queue,description,delete_flag,creator,operate_time,")
            .append("create_time,bill_type,config_code ) VALUES (  :appId, :appName,")
            .append(" :secret, :status, :businessScene, :businessType, :accountType,")
            .append(" :account, :accountName, :accountBalanceChange, :tradeType, :payType,")
            .append(" :innerFlow, :messageQueue, :description, :deleteFlag, :creator,")
            .append(" :operateTime, :createTime, :billType, :configCode )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentConfiguration(BasicPaymentConfiguration entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment_configuration SET app_id = :appId,")
            .append("app_name = :appName,secret = :secret,status = :status,")
            .append("business_scene = :businessScene,business_type = :businessType,")
            .append("account_type = :accountType,account = :account,")
            .append("account_name = :accountName,")
            .append("account_balance_change = :accountBalanceChange,")
            .append("trade_type = :tradeType,pay_type = :payType,inner_flow = :innerFlow,")
            .append("message_queue = :messageQueue,description = :description,")
            .append("delete_flag = :deleteFlag,creator = :creator,")
            .append("operate_time = :operateTime,create_time = :createTime,")
            .append("bill_type = :billType,config_code = :configCode WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPaymentConfiguration getBasicPaymentConfigurationById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpc.id,bpc.app_id,bpc.app_name,bpc.secret,bpc.status,")
            .append("bpc.business_scene,bpc.business_type,bpc.account_type,bpc.account,")
            .append("bpc.account_name,bpc.account_balance_change,bpc.trade_type,")
            .append("bpc.pay_type,bpc.inner_flow,bpc.message_queue,bpc.description,")
            .append("bpc.delete_flag,bpc.creator,bpc.operate_time,bpc.create_time,")
            .append("bpc.bill_type,bpc.config_code FROM basic_payment_configuration")
            .append(" bpc WHERE bpc.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentConfiguration.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentConfigurationById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment_configuration WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
