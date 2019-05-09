package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 退款单表实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "退款单表实体", description = "退款单表")
public class BasicRefundOrder {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 系统appid
     */
    @ApiModelProperty(name = "appId", value = "系统appid")
    private String appId;
    /**
     * 退款单号
     */
    @ApiModelProperty(name = "refundNo", value = "退款单号")
    private String refundNo;
    /**
     * 订单号
     */
    @ApiModelProperty(name = "orderNo", value = "订单号")
    private String orderNo;
    /**
     * 支付单流水号
     */
    @ApiModelProperty(name = "paySerialNumber", value = "支付单流水号")
    private String paySerialNumber;
    /**
     * 公众账号商户号
     */
    @ApiModelProperty(name = "wechatMchId", value = "公众账号商户号")
    private String wechatMchId;
    /**
     * 公众账号ID
     */
    @ApiModelProperty(name = "wechatAppId", value = "公众账号ID")
    private String wechatAppId;
    /**
     * 退款描述
     */
    @ApiModelProperty(name = "refundDesc", value = "退款描述")
    private String refundDesc;
    /**
     * 退款金额
     */
    @ApiModelProperty(name = "refundFee", value = "退款金额")
    private Long refundFee;
    /**
     * 部分退款[PARTIAL_REFUND]  全额退款[FULL REFUND]
     */
    @ApiModelProperty(name = "refundResult", value = "部分退款[PARTIAL_REFUND]  全额退款[FULL REFUND]")
    private String refundResult;
    /**
     * 退款结果描述,第三方返回
     */
    @ApiModelProperty(name = "refundResultDesc", value = "退款结果描述,第三方返回")
    private String refundResultDesc;
    /**
     * 成功[SUCCESS]  失败[FAIL]
     */
    @ApiModelProperty(name = "refundStatus", value = "成功[SUCCESS]  失败[FAIL]")
    private String refundStatus;
    /**
     * 自动退款[AUTO_REFUND]  确认退款[CONFIRM_REFUND]
     */
    @ApiModelProperty(name = "refundModel", value = "自动退款[AUTO_REFUND]  确认退款[CONFIRM_REFUND]")
    private String refundModel;
    /**
     * 
     */
    @ApiModelProperty(name = "deleteFlag", value = "")
    private Integer deleteFlag;
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


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getRefundNo() {
        return this.refundNo;
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

    public void setWechatMchId(String wechatMchId) {
        this.wechatMchId = wechatMchId;
    }

    public String getWechatMchId() {
        return this.wechatMchId;
    }

    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId;
    }

    public String getWechatAppId() {
        return this.wechatAppId;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getRefundDesc() {
        return this.refundDesc;
    }

    public void setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
    }

    public Long getRefundFee() {
        return this.refundFee;
    }

    public void setRefundResult(String refundResult) {
        this.refundResult = refundResult;
    }

    public String getRefundResult() {
        return this.refundResult;
    }

    public void setRefundResultDesc(String refundResultDesc) {
        this.refundResultDesc = refundResultDesc;
    }

    public String getRefundResultDesc() {
        return this.refundResultDesc;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundStatus() {
        return this.refundStatus;
    }

    public void setRefundModel(String refundModel) {
        this.refundModel = refundModel;
    }

    public String getRefundModel() {
        return this.refundModel;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return this.deleteFlag;
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


}