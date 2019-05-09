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
public class BasicPaymentOrderDao extends BaseDao<BasicPaymentOrder> {
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
    public int saveBasicPaymentOrder(BasicPaymentOrder entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment_order ( app_id,order_no,pay_serial_number,")
            .append("total_fee,subject,attach,submit_pay_time,business_type,business_desc,")
            .append("pay_control,batch_pay,trader_url,trade_type,pay_type,payee_account,")
            .append("payee,payer_account,payer,product_detail,back_url,notify_url,")
            .append("order_status,delete_flag,creator,create_time,operate_time,")
            .append("last_pay_time ) VALUES (  :appId, :orderNo, :paySerialNumber,")
            .append(" :totalFee, :subject, :attach, :submitPayTime, :businessType,")
            .append(" :businessDesc, :payControl, :batchPay, :traderUrl, :tradeType,")
            .append(" :payType, :payeeAccount, :payee, :payerAccount, :payer,")
            .append(" :productDetail, :backUrl, :notifyUrl, :orderStatus, :deleteFlag,")
            .append(" :creator, :createTime, :operateTime, :lastPayTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentOrder(BasicPaymentOrder entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment_order SET app_id = :appId,order_no = :orderNo,")
            .append("pay_serial_number = :paySerialNumber,total_fee = :totalFee,")
            .append("subject = :subject,attach = :attach,submit_pay_time = :submitPayTime,")
            .append("business_type = :businessType,business_desc = :businessDesc,")
            .append("pay_control = :payControl,batch_pay = :batchPay,")
            .append("trader_url = :traderUrl,trade_type = :tradeType,pay_type = :payType,")
            .append("payee_account = :payeeAccount,payee = :payee,")
            .append("payer_account = :payerAccount,payer = :payer,")
            .append("product_detail = :productDetail,back_url = :backUrl,")
            .append("notify_url = :notifyUrl,order_status = :orderStatus,")
            .append("delete_flag = :deleteFlag,creator = :creator,")
            .append("create_time = :createTime,operate_time = :operateTime,")
            .append("last_pay_time = :lastPayTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPaymentOrder getBasicPaymentOrderById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpo.id,bpo.app_id,bpo.order_no,bpo.pay_serial_number,")
            .append("bpo.total_fee,bpo.subject,bpo.attach,bpo.submit_pay_time,")
            .append("bpo.business_type,bpo.business_desc,bpo.pay_control,bpo.batch_pay,")
            .append("bpo.trader_url,bpo.trade_type,bpo.pay_type,bpo.payee_account,")
            .append("bpo.payee,bpo.payer_account,bpo.payer,bpo.product_detail,")
            .append("bpo.back_url,bpo.notify_url,bpo.order_status,bpo.delete_flag,")
            .append("bpo.creator,bpo.create_time,bpo.operate_time,bpo.last_pay_time")
            .append(" FROM basic_payment_order bpo WHERE bpo.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentOrder.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentOrderById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment_order WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
