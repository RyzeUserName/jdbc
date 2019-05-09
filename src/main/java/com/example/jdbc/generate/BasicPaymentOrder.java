package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "实体", description = "")
public class BasicPaymentOrder {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 支付系统appid
     */
    @ApiModelProperty(name = "appId", value = "支付系统appid")
    private String appId;
    /**
     * 业务单号
     */
    @ApiModelProperty(name = "orderNo", value = "业务单号")
    private String orderNo;
    /**
     * 支付单号
     */
    @ApiModelProperty(name = "paySerialNumber", value = "支付单号")
    private String paySerialNumber;
    /**
     * 支付金额
     */
    @ApiModelProperty(name = "totalFee", value = "支付金额")
    private BigDecimal totalFee;
    /**
     * 订单描述
     */
    @ApiModelProperty(name = "subject", value = "订单描述")
    private String subject;
    /**
     * 附加参数
     */
    @ApiModelProperty(name = "attach", value = "附加参数")
    private String attach;
    /**
     * 提交支付时间
     */
    @ApiModelProperty(name = "submitPayTime", value = "提交支付时间")
    private Date submitPayTime;
    /**
     * 业务类型
     */
    @ApiModelProperty(name = "businessType", value = "业务类型")
    private String businessType;
    /**
     * 业务场景描述
     */
    @ApiModelProperty(name = "businessDesc", value = "业务场景描述")
    private String businessDesc;
    /**
     * AUTO_PAY自动付，不去收银台，CONFIRM_PAY确认付，要去收银台
     */
    @ApiModelProperty(name = "payControl", value = "AUTO_PAY自动付，不去收银台，CONFIRM_PAY确认付，要去收银台")
    private String payControl;
    /**
     * 是否是批量0单个，１批量
     */
    @ApiModelProperty(name = "batchPay", value = "是否是批量0单个，１批量")
    private Integer batchPay;
    /**
     * 收银台url
     */
    @ApiModelProperty(name = "traderUrl", value = "收银台url")
    private String traderUrl;
    /**
     * 交易类型
     */
    @ApiModelProperty(name = "tradeType", value = "交易类型")
    private String tradeType;
    /**
     * 交易方式	内部(0)、第三方(1)
     */
    @ApiModelProperty(name = "payType", value = "交易方式	内部(0)、第三方(1)")
    private String payType;
    /**
     * 收款人账户
     */
    @ApiModelProperty(name = "payeeAccount", value = "收款人账户")
    private String payeeAccount;
    /**
     * 收款人
     */
    @ApiModelProperty(name = "payee", value = "收款人")
    private String payee;
    /**
     * 付款账户
     */
    @ApiModelProperty(name = "payerAccount", value = "付款账户")
    private String payerAccount;
    /**
     * 付款人
     */
    @ApiModelProperty(name = "payer", value = "付款人")
    private String payer;
    /**
     * 商品详情json
     */
    @ApiModelProperty(name = "productDetail", value = "商品详情json")
    private String productDetail;
    /**
     * 回调url 特殊的附加参数
     */
    @ApiModelProperty(name = "backUrl", value = "回调url 特殊的附加参数")
    private String backUrl;
    /**
     * 消息推送url
     */
    @ApiModelProperty(name = "notifyUrl", value = "消息推送url")
    private String notifyUrl;
    /**
     * 支付单状态待支付，支付成功，支付失败，已过期, 枚举
     */
    @ApiModelProperty(name = "orderStatus", value = "支付单状态待支付，支付成功，支付失败，已过期, 枚举")
    private String orderStatus;
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
    /**
     * 支付单最后支付时间 yyyyMMddHHmmss格式
     */
    @ApiModelProperty(name = "lastPayTime", value = "支付单最后支付时间 yyyyMMddHHmmss格式")
    private String lastPayTime;


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

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getTotalFee() {
        return this.totalFee;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getAttach() {
        return this.attach;
    }

    public void setSubmitPayTime(Date submitPayTime) {
        this.submitPayTime = submitPayTime;
    }

    public Date getSubmitPayTime() {
        return this.submitPayTime;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }

    public String getBusinessDesc() {
        return this.businessDesc;
    }

    public void setPayControl(String payControl) {
        this.payControl = payControl;
    }

    public String getPayControl() {
        return this.payControl;
    }

    public void setBatchPay(Integer batchPay) {
        this.batchPay = batchPay;
    }

    public Integer getBatchPay() {
        return this.batchPay;
    }

    public void setTraderUrl(String traderUrl) {
        this.traderUrl = traderUrl;
    }

    public String getTraderUrl() {
        return this.traderUrl;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

    public String getPayeeAccount() {
        return this.payeeAccount;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getPayee() {
        return this.payee;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public String getPayerAccount() {
        return this.payerAccount;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayer() {
        return this.payer;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductDetail() {
        return this.productDetail;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public String getBackUrl() {
        return this.backUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return this.orderStatus;
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

    public void setLastPayTime(String lastPayTime) {
        this.lastPayTime = lastPayTime;
    }

    public String getLastPayTime() {
        return this.lastPayTime;
    }


}