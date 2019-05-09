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
public class BasicPaymentChannel {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 适用于( PC网站、公众号、小程序、app)
     */
    @ApiModelProperty(name = "apply", value = "适用于( PC网站、公众号、小程序、app)")
    private String apply;
    /**
     * 渠道编码
     */
    @ApiModelProperty(name = "channelCode", value = "渠道编码")
    private String channelCode;
    /**
     * 渠道名称（微信、支付宝等）
     */
    @ApiModelProperty(name = "channelName", value = "渠道名称（微信、支付宝等）")
    private String channelName;
    /**
     * 
     */
    @ApiModelProperty(name = "accountName", value = "")
    private String accountName;
    /**
     * 支付方式
     */
    @ApiModelProperty(name = "payType", value = "支付方式")
    private String payType;
    /**
     * 截止日期
     */
    @ApiModelProperty(name = "entTime", value = "截止日期")
    private Date entTime;
    /**
     * 公司名称
     */
    @ApiModelProperty(name = "companyName", value = "公司名称")
    private String companyName;
    /**
     * 
     */
    @ApiModelProperty(name = "accountPeriod", value = "")
    private String accountPeriod;
    /**
     * 渠道费率
     */
    @ApiModelProperty(name = "rate", value = "渠道费率")
    private String rate;
    /**
     * 对账形式
     */
    @ApiModelProperty(name = "reconciliationForm", value = "对账形式")
    private String reconciliationForm;
    /**
     * 账单提供方式
     */
    @ApiModelProperty(name = "billFormat", value = "账单提供方式")
    private String billFormat;
    /**
     * 账单文件格式
     */
    @ApiModelProperty(name = "fileFormat", value = "账单文件格式")
    private String fileFormat;
    /**
     * 状态0启用，1禁用，默认启用
     */
    @ApiModelProperty(name = "status", value = "状态0启用，1禁用，默认启用")
    private Long status;
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

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getApply() {
        return this.apply;
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

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setEntTime(Date entTime) {
        this.entTime = entTime;
    }

    public Date getEntTime() {
        return this.entTime;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setAccountPeriod(String accountPeriod) {
        this.accountPeriod = accountPeriod;
    }

    public String getAccountPeriod() {
        return this.accountPeriod;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return this.rate;
    }

    public void setReconciliationForm(String reconciliationForm) {
        this.reconciliationForm = reconciliationForm;
    }

    public String getReconciliationForm() {
        return this.reconciliationForm;
    }

    public void setBillFormat(String billFormat) {
        this.billFormat = billFormat;
    }

    public String getBillFormat() {
        return this.billFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return this.fileFormat;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
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