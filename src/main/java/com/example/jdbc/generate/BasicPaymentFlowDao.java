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
public class BasicPaymentFlowDao extends BaseDao<BasicPaymentFlow> {
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
    public int saveBasicPaymentFlow(BasicPaymentFlow entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment_flow ( order_no,pay_serial_number,")
            .append("pay_channel,pay_type,pay_result,payer_source,pay_time,")
            .append("pay_response_time,pay_response_text,pay_time_start,pay_time_expire,")
            .append("qr_code,transaction_id,delete_flag,operator,operate_time,create_time")
            .append(" ) VALUES (  :orderNo, :paySerialNumber, :payChannel, :payType,")
            .append(" :payResult, :payerSource, :payTime, :payResponseTime,")
            .append(" :payResponseText, :payTimeStart, :payTimeExpire, :qrCode,")
            .append(" :transactionId, :deleteFlag, :operator, :operateTime, :createTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentFlow(BasicPaymentFlow entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment_flow SET order_no = :orderNo,")
            .append("pay_serial_number = :paySerialNumber,pay_channel = :payChannel,")
            .append("pay_type = :payType,pay_result = :payResult,")
            .append("payer_source = :payerSource,pay_time = :payTime,")
            .append("pay_response_time = :payResponseTime,")
            .append("pay_response_text = :payResponseText,pay_time_start = :payTimeStart,")
            .append("pay_time_expire = :payTimeExpire,qr_code = :qrCode,")
            .append("transaction_id = :transactionId,delete_flag = :deleteFlag,")
            .append("operator = :operator,operate_time = :operateTime,")
            .append("create_time = :createTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPaymentFlow getBasicPaymentFlowById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpf.id,bpf.order_no,bpf.pay_serial_number,bpf.pay_channel,")
            .append("bpf.pay_type,bpf.pay_result,bpf.payer_source,bpf.pay_time,")
            .append("bpf.pay_response_time,bpf.pay_response_text,bpf.pay_time_start,")
            .append("bpf.pay_time_expire,bpf.qr_code,bpf.transaction_id,bpf.delete_flag,")
            .append("bpf.operator,bpf.operate_time,bpf.create_time FROM basic_payment_flow")
            .append(" bpf WHERE bpf.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentFlow.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentFlowById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment_flow WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
