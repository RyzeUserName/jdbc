package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 支付表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BasicPaymentDao extends BaseDao<BasicPayment> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 支付表实体
     * @param entity 支付表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBasicPayment(BasicPayment entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment ( pay_order_no,business_order_no,")
            .append("business_order_name,business_order_desc,total_fee,pay_type,pay_way,")
            .append("notify_url,fee_type,pay_time,pay_status,front_url,attach,operator,")
            .append("qr_code_path,transaction_id,pay_operation_mode,callback_status,appid,")
            .append("caller,delete_flag,creator,create_time,operate_time ) VALUES ( ")
            .append(" :payOrderNo, :businessOrderNo, :businessOrderName,")
            .append(" :businessOrderDesc, :totalFee, :payType, :payWay, :notifyUrl,")
            .append(" :feeType, :payTime, :payStatus, :frontUrl, :attach, :operator,")
            .append(" :qrCodePath, :transactionId, :payOperationMode, :callbackStatus,")
            .append(" :appid, :caller, :deleteFlag, :creator, :createTime, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 支付表实体
     * @param entity 支付表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPayment(BasicPayment entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment SET pay_order_no = :payOrderNo,")
            .append("business_order_no = :businessOrderNo,")
            .append("business_order_name = :businessOrderName,")
            .append("business_order_desc = :businessOrderDesc,total_fee = :totalFee,")
            .append("pay_type = :payType,pay_way = :payWay,notify_url = :notifyUrl,")
            .append("fee_type = :feeType,pay_time = :payTime,pay_status = :payStatus,")
            .append("front_url = :frontUrl,attach = :attach,operator = :operator,")
            .append("qr_code_path = :qrCodePath,transaction_id = :transactionId,")
            .append("pay_operation_mode = :payOperationMode,")
            .append("callback_status = :callbackStatus,appid = :appid,caller = :caller,")
            .append("delete_flag = :deleteFlag,creator = :creator,")
            .append("create_time = :createTime,operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取支付表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPayment getBasicPaymentById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bp.id,bp.pay_order_no,bp.business_order_no,")
            .append("bp.business_order_name,bp.business_order_desc,bp.total_fee,")
            .append("bp.pay_type,bp.pay_way,bp.notify_url,bp.fee_type,bp.pay_time,")
            .append("bp.pay_status,bp.front_url,bp.attach,bp.operator,bp.qr_code_path,")
            .append("bp.transaction_id,bp.pay_operation_mode,bp.callback_status,bp.appid,")
            .append("bp.caller,bp.delete_flag,bp.creator,bp.create_time,bp.operate_time")
            .append(" FROM basic_payment bp WHERE bp.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPayment.class, sql.toString(), params);
    }

    /**
     * 删除支付表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
