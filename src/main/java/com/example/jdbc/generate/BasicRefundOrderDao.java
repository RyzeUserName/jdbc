package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 退款单表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BasicRefundOrderDao extends BaseDao<BasicRefundOrder> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 退款单表实体
     * @param entity 退款单表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBasicRefundOrder(BasicRefundOrder entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_refund_order ( app_id,refund_no,order_no,")
            .append("pay_serial_number,wechat_mch_id,wechat_app_id,refund_desc,refund_fee,")
            .append("refund_result,refund_result_desc,refund_status,refund_model,")
            .append("delete_flag,creator,create_time,operate_time ) VALUES (  :appId,")
            .append(" :refundNo, :orderNo, :paySerialNumber, :wechatMchId, :wechatAppId,")
            .append(" :refundDesc, :refundFee, :refundResult, :refundResultDesc,")
            .append(" :refundStatus, :refundModel, :deleteFlag, :creator, :createTime,")
            .append(" :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 退款单表实体
     * @param entity 退款单表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicRefundOrder(BasicRefundOrder entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_refund_order SET app_id = :appId,refund_no = :refundNo,")
            .append("order_no = :orderNo,pay_serial_number = :paySerialNumber,")
            .append("wechat_mch_id = :wechatMchId,wechat_app_id = :wechatAppId,")
            .append("refund_desc = :refundDesc,refund_fee = :refundFee,")
            .append("refund_result = :refundResult,refund_result_desc = :refundResultDesc,")
            .append("refund_status = :refundStatus,refund_model = :refundModel,")
            .append("delete_flag = :deleteFlag,creator = :creator,")
            .append("create_time = :createTime,operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取退款单表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicRefundOrder getBasicRefundOrderById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bro.id,bro.app_id,bro.refund_no,bro.order_no,")
            .append("bro.pay_serial_number,bro.wechat_mch_id,bro.wechat_app_id,")
            .append("bro.refund_desc,bro.refund_fee,bro.refund_result,")
            .append("bro.refund_result_desc,bro.refund_status,bro.refund_model,")
            .append("bro.delete_flag,bro.creator,bro.create_time,bro.operate_time")
            .append(" FROM basic_refund_order bro WHERE bro.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicRefundOrder.class, sql.toString(), params);
    }

    /**
     * 删除退款单表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicRefundOrderById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_refund_order WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
