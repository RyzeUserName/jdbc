package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 退款表实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "退款表实体", description = "退款表")
public class BasicRefund {
    /**
     * 主键
     */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;
    /**
     * 支付订单编号，引用自pay_order_no
     */
    @ApiModelProperty(name = "payOrderNo", value = "支付订单编号，引用自pay_order_no")
    private String payOrderNo;
    /**
     * 业务订单编号
     */
    @ApiModelProperty(name = "businessOrderNo", value = "业务订单编号")
    private String businessOrderNo;
    /**
     * 退款订单编号
     */
    @ApiModelProperty(name = "refundOrderNo", value = "退款订单编号")
    private String refundOrderNo;
    /**
     * 退款金额
     */
    @ApiModelProperty(name = "refundFee", value = "退款金额")
    private Long refundFee;
    /**
     * 退款时间
     */
    @ApiModelProperty(name = "refundTime", value = "退款时间")
    private Date refundTime;
    /**
     * 退款状态
     */
    @ApiModelProperty(name = "refundStatus", value = "退款状态")
    private String refundStatus;
    /**
     * 退款原因
     */
    @ApiModelProperty(name = "refundDesc", value = "退款原因")
    private String refundDesc;
    /**
     * 
     */
    @ApiModelProperty(name = "creator", value = "")
    private String creator;
    /**
     * 
     */
    @ApiModelProperty(name = "createTime", value = "")
    private Date createTime;
    /**
     * 
     */
    @ApiModelProperty(name = "operateTime", value = "")
    private Date operateTime;
    /**
     * 
     */
    @ApiModelProperty(name = "operator", value = "")
    private String operator;
    /**
     * 
     */
    @ApiModelProperty(name = "deleteFlag", value = "")
    private Integer deleteFlag;
    /**
     * 业务通知地址
     */
    @ApiModelProperty(name = "notifyUrl", value = "业务通知地址")
    private String notifyUrl;
    /**
     * 回调业务系统状态(1、回调成功，0、回调失败)
     */
    @ApiModelProperty(name = "callbackStatus", value = "回调业务系统状态(1、回调成功，0、回调失败)")
    private String callbackStatus;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getPayOrderNo() {
        return this.payOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessOrderNo() {
        return this.businessOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getRefundOrderNo() {
        return this.refundOrderNo;
    }

    public void setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
    }

    public Long getRefundFee() {
        return this.refundFee;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Date getRefundTime() {
        return this.refundTime;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundStatus() {
        return this.refundStatus;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getRefundDesc() {
        return this.refundDesc;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setCallbackStatus(String callbackStatus) {
        this.callbackStatus = callbackStatus;
    }

    public String getCallbackStatus() {
        return this.callbackStatus;
    }


}