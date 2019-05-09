package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 微信退款响应表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BasicWechatRefundDao extends BaseDao<BasicWechatRefund> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 微信退款响应表实体
     * @param entity 微信退款响应表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBasicWechatRefund(BasicWechatRefund entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_wechat_refund ( pay_serial_number,return_code,")
            .append("return_msg,appid,mch_id,nonce_str,sign,result_code,transaction_id,")
            .append("out_trade_no,out_refund_no,refund_id,refund_channel,refund_fee,")
            .append("coupon_refund_fee,total_fee,cash_fee,coupon_refund_count,")
            .append("cash_refund_fee,err_code,err_code_des ) VALUES (  :paySerialNumber,")
            .append(" :returnCode, :returnMsg, :appid, :mchId, :nonceStr, :sign,")
            .append(" :resultCode, :transactionId, :outTradeNo, :outRefundNo, :refundId,")
            .append(" :refundChannel, :refundFee, :couponRefundFee, :totalFee, :cashFee,")
            .append(" :couponRefundCount, :cashRefundFee, :errCode, :errCodeDes )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 微信退款响应表实体
     * @param entity 微信退款响应表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicWechatRefund(BasicWechatRefund entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_wechat_refund SET pay_serial_number = :paySerialNumber,")
            .append("return_code = :returnCode,return_msg = :returnMsg,appid = :appid,")
            .append("mch_id = :mchId,nonce_str = :nonceStr,sign = :sign,")
            .append("result_code = :resultCode,transaction_id = :transactionId,")
            .append("out_trade_no = :outTradeNo,out_refund_no = :outRefundNo,")
            .append("refund_id = :refundId,refund_channel = :refundChannel,")
            .append("refund_fee = :refundFee,coupon_refund_fee = :couponRefundFee,")
            .append("total_fee = :totalFee,cash_fee = :cashFee,")
            .append("coupon_refund_count = :couponRefundCount,")
            .append("cash_refund_fee = :cashRefundFee,err_code = :errCode,")
            .append("err_code_des = :errCodeDes WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取微信退款响应表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicWechatRefund getBasicWechatRefundById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bwr.id,bwr.pay_serial_number,bwr.return_code,bwr.return_msg,")
            .append("bwr.appid,bwr.mch_id,bwr.nonce_str,bwr.sign,bwr.result_code,")
            .append("bwr.transaction_id,bwr.out_trade_no,bwr.out_refund_no,bwr.refund_id,")
            .append("bwr.refund_channel,bwr.refund_fee,bwr.coupon_refund_fee,")
            .append("bwr.total_fee,bwr.cash_fee,bwr.coupon_refund_count,")
            .append("bwr.cash_refund_fee,bwr.err_code,bwr.err_code_des")
            .append(" FROM basic_wechat_refund bwr WHERE bwr.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicWechatRefund.class, sql.toString(), params);
    }

    /**
     * 删除微信退款响应表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicWechatRefundById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_wechat_refund WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
