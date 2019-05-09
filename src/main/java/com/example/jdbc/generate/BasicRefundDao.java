package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 退款表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BasicRefundDao extends BaseDao<BasicRefund> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 退款表实体
     * @param entity 退款表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBasicRefund(BasicRefund entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_refund ( pay_order_no,business_order_no,")
            .append("refund_order_no,refund_fee,refund_time,refund_status,refund_desc,")
            .append("creator,create_time,operate_time,operator,delete_flag,notify_url,")
            .append("callback_status ) VALUES (  :payOrderNo, :businessOrderNo,")
            .append(" :refundOrderNo, :refundFee, :refundTime, :refundStatus, :refundDesc,")
            .append(" :creator, :createTime, :operateTime, :operator, :deleteFlag,")
            .append(" :notifyUrl, :callbackStatus )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 退款表实体
     * @param entity 退款表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicRefund(BasicRefund entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_refund SET pay_order_no = :payOrderNo,")
            .append("business_order_no = :businessOrderNo,")
            .append("refund_order_no = :refundOrderNo,refund_fee = :refundFee,")
            .append("refund_time = :refundTime,refund_status = :refundStatus,")
            .append("refund_desc = :refundDesc,creator = :creator,")
            .append("create_time = :createTime,operate_time = :operateTime,")
            .append("operator = :operator,delete_flag = :deleteFlag,")
            .append("notify_url = :notifyUrl,callback_status = :callbackStatus")
            .append(" WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取退款表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicRefund getBasicRefundById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT br.id,br.pay_order_no,br.business_order_no,br.refund_order_no,")
            .append("br.refund_fee,br.refund_time,br.refund_status,br.refund_desc,")
            .append("br.creator,br.create_time,br.operate_time,br.operator,br.delete_flag,")
            .append("br.notify_url,br.callback_status FROM basic_refund")
            .append(" br WHERE br.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicRefund.class, sql.toString(), params);
    }

    /**
     * 删除退款表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicRefundById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_refund WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
