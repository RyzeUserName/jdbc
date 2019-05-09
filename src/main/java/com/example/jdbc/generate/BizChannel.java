package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 渠道信息实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "渠道信息实体", description = "渠道信息")
public class BizChannel {
    /**
     * id	
     */
    @ApiModelProperty(name = "id", value = "id	")
    private Long id;
    /**
     * 渠道编码
     */
    @ApiModelProperty(name = "channelCode", value = "渠道编码")
    private String channelCode;
    /**
     * 渠道名称
     */
    @ApiModelProperty(name = "channelName", value = "渠道名称")
    private String channelName;
    /**
     * 支付渠道类型,第三方支付THIRD、银行BANK、银联UNIONPAY
     */
    @ApiModelProperty(name = "channelType", value = "支付渠道类型,第三方支付THIRD、银行BANK、银联UNIONPAY")
    private String channelType;
    /**
     * 对账形式 自动对账AUTO、手动对账HAND
     */
    @ApiModelProperty(name = "reconciliationForm", value = "对账形式 自动对账AUTO、手动对账HAND")
    private String reconciliationForm;
    /**
     * 对账时间 10:00
     */
    @ApiModelProperty(name = "reconciliationTime", value = "对账时间 10:00")
    private String reconciliationTime;
    /**
     * “HTTP”、“HTTPS”、“FTP”、“手动上传”
     */
    @ApiModelProperty(name = "billPattern", value = "“HTTP”、“HTTPS”、“FTP”、“手动上传”")
    private String billPattern;
    /**
     * url
     */
    @ApiModelProperty(name = "billUrl", value = "url")
    private String billUrl;
    /**
     * .xml”、“.txt”、“.csv”、“.exl”、“.zip”
     */
    @ApiModelProperty(name = "fileFormat", value = ".xml”、“.txt”、“.csv”、“.exl”、“.zip”")
    private String fileFormat;
    /**
     * 可退款周期
     */
    @ApiModelProperty(name = "refundablePeriod", value = "可退款周期")
    private Long refundablePeriod;
    /**
     * 否退手续费
     */
    @ApiModelProperty(name = "handlingFeeFlag", value = "否退手续费")
    private Integer handlingFeeFlag;
    /**
     * 父id
     */
    @ApiModelProperty(name = "parentId", value = "父id")
    private Long parentId;
    /**
     * 渠道侧机构简称
     */
    @ApiModelProperty(name = "channelOrganizationName", value = "渠道侧机构简称")
    private String channelOrganizationName;
    /**
     * 公司名称
     */
    @ApiModelProperty(name = "companyName", value = "公司名称")
    private String companyName;
    /**
     * 商户号
     */
    @ApiModelProperty(name = "businessNumber", value = "商户号")
    private String businessNumber;
    /**
     * 支付密钥
     */
    @ApiModelProperty(name = "paymentKey", value = "支付密钥")
    private String paymentKey;
    /**
     * 费率
     */
    @ApiModelProperty(name = "rate", value = "费率")
    private String rate;
    /**
     * 全路径
     */
    @ApiModelProperty(name = "path", value = "全路径")
    private String path;
    /**
     * 结算周期
     */
    @ApiModelProperty(name = "billingCycle", value = "结算周期")
    private Long billingCycle;
    /**
     * 截止日期
     */
    @ApiModelProperty(name = "entTime", value = "截止日期")
    private Date entTime;
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

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelCode() {
        return this.channelCode;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setReconciliationForm(String reconciliationForm) {
        this.reconciliationForm = reconciliationForm;
    }

    public String getReconciliationForm() {
        return this.reconciliationForm;
    }

    public void setReconciliationTime(String reconciliationTime) {
        this.reconciliationTime = reconciliationTime;
    }

    public String getReconciliationTime() {
        return this.reconciliationTime;
    }

    public void setBillPattern(String billPattern) {
        this.billPattern = billPattern;
    }

    public String getBillPattern() {
        return this.billPattern;
    }

    public void setBillUrl(String billUrl) {
        this.billUrl = billUrl;
    }

    public String getBillUrl() {
        return this.billUrl;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return this.fileFormat;
    }

    public void setRefundablePeriod(Long refundablePeriod) {
        this.refundablePeriod = refundablePeriod;
    }

    public Long getRefundablePeriod() {
        return this.refundablePeriod;
    }

    public void setHandlingFeeFlag(Integer handlingFeeFlag) {
        this.handlingFeeFlag = handlingFeeFlag;
    }

    public Integer getHandlingFeeFlag() {
        return this.handlingFeeFlag;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setChannelOrganizationName(String channelOrganizationName) {
        this.channelOrganizationName = channelOrganizationName;
    }

    public String getChannelOrganizationName() {
        return this.channelOrganizationName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public void setPaymentKey(String paymentKey) {
        this.paymentKey = paymentKey;
    }

    public String getPaymentKey() {
        return this.paymentKey;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return this.rate;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }

    public void setBillingCycle(Long billingCycle) {
        this.billingCycle = billingCycle;
    }

    public Long getBillingCycle() {
        return this.billingCycle;
    }

    public void setEntTime(Date entTime) {
        this.entTime = entTime;
    }

    public Date getEntTime() {
        return this.entTime;
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