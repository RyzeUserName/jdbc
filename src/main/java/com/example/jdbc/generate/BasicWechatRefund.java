package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 微信退款响应表实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "微信退款响应表实体", description = "微信退款响应表")
public class BasicWechatRefund {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 支付单流水号
     */
    @ApiModelProperty(name = "paySerialNumber", value = "支付单流水号")
    private String paySerialNumber;
    /**
     * 返回状态码
     */
    @ApiModelProperty(name = "returnCode", value = "返回状态码")
    private String returnCode;
    /**
     * 返回信息
     */
    @ApiModelProperty(name = "returnMsg", value = "返回信息")
    private String returnMsg;
    /**
     * 公众账号ID
     */
    @ApiModelProperty(name = "appid", value = "公众账号ID")
    private String appid;
    /**
     * 商户号
     */
    @ApiModelProperty(name = "mchId", value = "商户号")
    private String mchId;
    /**
     * 随机字符串
     */
    @ApiModelProperty(name = "nonceStr", value = "随机字符串")
    private String nonceStr;
    /**
     * 签名
     */
    @ApiModelProperty(name = "sign", value = "签名")
    private String sign;
    /**
     * 业务结果
     */
    @ApiModelProperty(name = "resultCode", value = "业务结果")
    private String resultCode;
    /**
     * 微信订单号
     */
    @ApiModelProperty(name = "transactionId", value = "微信订单号")
    private String transactionId;
    /**
     * 商户订单号
     */
    @ApiModelProperty(name = "outTradeNo", value = "商户订单号")
    private String outTradeNo;
    /**
     * 商户退款单号
     */
    @ApiModelProperty(name = "outRefundNo", value = "商户退款单号")
    private String outRefundNo;
    /**
     * 微信退款单号
     */
    @ApiModelProperty(name = "refundId", value = "微信退款单号")
    private String refundId;
    /**
     * 退款渠道 ORIGINAL—原路退款 BALANCE—退回到余额 OTHER_BALANCE—原账户异常退到其他余额账户 OTHER_BANKCARD—原银行卡异常退到其他银行卡
     */
    @ApiModelProperty(name = "refundChannel", value = "退款渠道 ORIGINAL—原路退款 BALANCE—退回到余额 OTHER_BALANCE—原账户异常退到其他余额账户 OTHER_BANKCARD—原银行卡异常退到其他银行卡")
    private String refundChannel;
    /**
     * 申请退款金额
     */
    @ApiModelProperty(name = "refundFee", value = "申请退款金额")
    private Long refundFee;
    /**
     * 总代金券退款金额  代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金
     */
    @ApiModelProperty(name = "couponRefundFee", value = "总代金券退款金额  代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金")
    private Long couponRefundFee;
    /**
     * 订单金额 订单总金额，单位为分，只能为整数
     */
    @ApiModelProperty(name = "totalFee", value = "订单金额 订单总金额，单位为分，只能为整数")
    private Long totalFee;
    /**
     * 现金支付金额，单位为分，只能为整数
     */
    @ApiModelProperty(name = "cashFee", value = "现金支付金额，单位为分，只能为整数")
    private Long cashFee;
    /**
     * 退款代金券使用数量
     */
    @ApiModelProperty(name = "couponRefundCount", value = "退款代金券使用数量")
    private Long couponRefundCount;
    /**
     * 现金退款金额
     */
    @ApiModelProperty(name = "cashRefundFee", value = "现金退款金额")
    private Long cashRefundFee;
    /**
     * 错误代码
     */
    @ApiModelProperty(name = "errCode", value = "错误代码")
    private String errCode;
    /**
     * 错误码描述
     */
    @ApiModelProperty(name = "errCodeDes", value = "错误码描述")
    private String errCodeDes;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setPaySerialNumber(String paySerialNumber) {
        this.paySerialNumber = paySerialNumber;
    }

    public String getPaySerialNumber() {
        return this.paySerialNumber;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppid() {
        return this.appid;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchId() {
        return this.mchId;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return this.sign;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getOutRefundNo() {
        return this.outRefundNo;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundId() {
        return this.refundId;
    }

    public void setRefundChannel(String refundChannel) {
        this.refundChannel = refundChannel;
    }

    public String getRefundChannel() {
        return this.refundChannel;
    }

    public void setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
    }

    public Long getRefundFee() {
        return this.refundFee;
    }

    public void setCouponRefundFee(Long couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
    }

    public Long getCouponRefundFee() {
        return this.couponRefundFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public Long getTotalFee() {
        return this.totalFee;
    }

    public void setCashFee(Long cashFee) {
        this.cashFee = cashFee;
    }

    public Long getCashFee() {
        return this.cashFee;
    }

    public void setCouponRefundCount(Long couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }

    public Long getCouponRefundCount() {
        return this.couponRefundCount;
    }

    public void setCashRefundFee(Long cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    public Long getCashRefundFee() {
        return this.cashRefundFee;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getErrCodeDes() {
        return this.errCodeDes;
    }


}