package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 支付表实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "支付表实体", description = "支付表")
public class BasicPayment {
    /**
     * 主键id
     */
    @ApiModelProperty(name = "id", value = "主键id")
    private Long id;
    /**
     * 支付订单编号
     */
    @ApiModelProperty(name = "payOrderNo", value = "支付订单编号")
    private String payOrderNo;
    /**
     * 业务订单编号
     */
    @ApiModelProperty(name = "businessOrderNo", value = "业务订单编号")
    private String businessOrderNo;
    /**
     * 业务订单名称
     */
    @ApiModelProperty(name = "businessOrderName", value = "业务订单名称")
    private String businessOrderName;
    /**
     * 业务订单描述
     */
    @ApiModelProperty(name = "businessOrderDesc", value = "业务订单描述")
    private String businessOrderDesc;
    /**
     * 支付总金额，单位为分
     */
    @ApiModelProperty(name = "totalFee", value = "支付总金额，单位为分")
    private Long totalFee;
    /**
     * 支付类型(1:支付宝 2:微信 3:银联)
     */
    @ApiModelProperty(name = "payType", value = "支付类型(1:支付宝 2:微信 3:银联)")
    private String payType;
    /**
     * 支付方式 (1：PC,平板 2：手机)
     */
    @ApiModelProperty(name = "payWay", value = "支付方式 (1：PC,平板 2：手机)")
    private String payWay;
    /**
     * 业务通知地址
     */
    @ApiModelProperty(name = "notifyUrl", value = "业务通知地址")
    private String notifyUrl;
    /**
     * 支付币种
     */
    @ApiModelProperty(name = "feeType", value = "支付币种")
    private String feeType;
    /**
     * 支付时间
     */
    @ApiModelProperty(name = "payTime", value = "支付时间")
    private Date payTime;
    /**
     * 支付状态（订单创建，支付成功，支付失败等）
     */
    @ApiModelProperty(name = "payStatus", value = "支付状态（订单创建，支付成功，支付失败等）")
    private String payStatus;
    /**
     * 前台回调地址  非扫码支付使用
     */
    @ApiModelProperty(name = "frontUrl", value = "前台回调地址  非扫码支付使用")
    private String frontUrl;
    /**
     * 附件数据主要用于商户携带订单的自定义数据
     */
    @ApiModelProperty(name = "attach", value = "附件数据主要用于商户携带订单的自定义数据")
    private String attach;
    /**
     * 操作人
     */
    @ApiModelProperty(name = "operator", value = "操作人")
    private String operator;
    /**
     * 二维码路径
     */
    @ApiModelProperty(name = "qrCodePath", value = "二维码路径")
    private String qrCodePath;
    /**
     * 微信支付订单号
     */
    @ApiModelProperty(name = "transactionId", value = "微信支付订单号")
    private String transactionId;
    /**
     * 支付操作方式，比如微信支付可以包括小程序支付，H5支付，公众号支付，扫码支付等
     */
    @ApiModelProperty(name = "payOperationMode", value = "支付操作方式，比如微信支付可以包括小程序支付，H5支付，公众号支付，扫码支付等")
    private String payOperationMode;
    /**
     * 回调业务系统状态(1、回调成功，0、回调失败)
     */
    @ApiModelProperty(name = "callbackStatus", value = "回调业务系统状态(1、回调成功，0、回调失败)")
    private String callbackStatus;
    /**
     * appid
     */
    @ApiModelProperty(name = "appid", value = "appid")
    private String appid;
    /**
     * 调用方
     */
    @ApiModelProperty(name = "caller", value = "调用方")
    private String caller;
    /**
     * 删除标志，0为未删除
     */
    @ApiModelProperty(name = "deleteFlag", value = "删除标志，0为未删除")
    private Integer deleteFlag;
    /**
     * 创建人
     */
    @ApiModelProperty(name = "creator", value = "创建人")
    private String creator;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "createTime", value = "创建时间")
    private Date createTime;
    /**
     * 操作时间
     */
    @ApiModelProperty(name = "operateTime", value = "操作时间")
    private String operateTime;


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

    public void setBusinessOrderName(String businessOrderName) {
        this.businessOrderName = businessOrderName;
    }

    public String getBusinessOrderName() {
        return this.businessOrderName;
    }

    public void setBusinessOrderDesc(String businessOrderDesc) {
        this.businessOrderDesc = businessOrderDesc;
    }

    public String getBusinessOrderDesc() {
        return this.businessOrderDesc;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public Long getTotalFee() {
        return this.totalFee;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPayWay() {
        return this.payWay;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeType() {
        return this.feeType;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayStatus() {
        return this.payStatus;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }

    public String getFrontUrl() {
        return this.frontUrl;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getAttach() {
        return this.attach;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setQrCodePath(String qrCodePath) {
        this.qrCodePath = qrCodePath;
    }

    public String getQrCodePath() {
        return this.qrCodePath;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setPayOperationMode(String payOperationMode) {
        this.payOperationMode = payOperationMode;
    }

    public String getPayOperationMode() {
        return this.payOperationMode;
    }

    public void setCallbackStatus(String callbackStatus) {
        this.callbackStatus = callbackStatus;
    }

    public String getCallbackStatus() {
        return this.callbackStatus;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppid() {
        return this.appid;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCaller() {
        return this.caller;
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

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateTime() {
        return this.operateTime;
    }


}