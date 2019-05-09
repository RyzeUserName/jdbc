package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "实体", description = "")
public class BasicPaymentFlow {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 业务订单号
     */
    @ApiModelProperty(name = "orderNo", value = "业务订单号")
    private String orderNo;
    /**
     * 本系统支付流水号
     */
    @ApiModelProperty(name = "paySerialNumber", value = "本系统支付流水号")
    private String paySerialNumber;
    /**
     * 支付渠道 支付宝、网银、微信
     */
    @ApiModelProperty(name = "payChannel", value = "支付渠道 支付宝、网银、微信")
    private String payChannel;
    /**
     * JSAPI 公众号支付NATIVE 扫码支付APP APP支付
     */
    @ApiModelProperty(name = "payType", value = "JSAPI 公众号支付NATIVE 扫码支付APP APP支付")
    private String payType;
    /**
     * 支付状态 成功 失败
     */
    @ApiModelProperty(name = "payResult", value = "支付状态 成功 失败")
    private String payResult;
    /**
     * 付款源（内部个人账户或是微信的流水号）
     */
    @ApiModelProperty(name = "payerSource", value = "付款源（内部个人账户或是微信的流水号）")
    private String payerSource;
    /**
     * 支付时间
     */
    @ApiModelProperty(name = "payTime", value = "支付时间")
    private Date payTime;
    /**
     * 支付响应时间
     */
    @ApiModelProperty(name = "payResponseTime", value = "支付响应时间")
    private Date payResponseTime;
    /**
     * 支付响应数据 json
     */
    @ApiModelProperty(name = "payResponseText", value = "支付响应数据 json")
    private String payResponseText;
    /**
     * 支付开始时间
     */
    @ApiModelProperty(name = "payTimeStart", value = "支付开始时间")
    private Date payTimeStart;
    /**
     * 支付结束时间
     */
    @ApiModelProperty(name = "payTimeExpire", value = "支付结束时间")
    private Date payTimeExpire;
    /**
     * 二维码支付路径
     */
    @ApiModelProperty(name = "qrCode", value = "二维码支付路径")
    private String qrCode;
    /**
     * 第三方支付订单号
     */
    @ApiModelProperty(name = "transactionId", value = "第三方支付订单号")
    private String transactionId;
    /**
     * 
     */
    @ApiModelProperty(name = "deleteFlag", value = "")
    private Integer deleteFlag;
    /**
     * 
     */
    @ApiModelProperty(name = "operator", value = "")
    private String operator;
    /**
     * 
     */
    @ApiModelProperty(name = "operateTime", value = "")
    private Date operateTime;
    /**
     * 
     */
    @ApiModelProperty(name = "createTime", value = "")
    private Date createTime;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setPaySerialNumber(String paySerialNumber) {
        this.paySerialNumber = paySerialNumber;
    }

    public String getPaySerialNumber() {
        return this.paySerialNumber;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayChannel() {
        return this.payChannel;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getPayResult() {
        return this.payResult;
    }

    public void setPayerSource(String payerSource) {
        this.payerSource = payerSource;
    }

    public String getPayerSource() {
        return this.payerSource;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayResponseTime(Date payResponseTime) {
        this.payResponseTime = payResponseTime;
    }

    public Date getPayResponseTime() {
        return this.payResponseTime;
    }

    public void setPayResponseText(String payResponseText) {
        this.payResponseText = payResponseText;
    }

    public String getPayResponseText() {
        return this.payResponseText;
    }

    public void setPayTimeStart(Date payTimeStart) {
        this.payTimeStart = payTimeStart;
    }

    public Date getPayTimeStart() {
        return this.payTimeStart;
    }

    public void setPayTimeExpire(Date payTimeExpire) {
        this.payTimeExpire = payTimeExpire;
    }

    public Date getPayTimeExpire() {
        return this.payTimeExpire;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getQrCode() {
        return this.qrCode;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }


}