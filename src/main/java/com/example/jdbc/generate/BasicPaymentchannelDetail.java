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
public class BasicPaymentchannelDetail {
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
     * 渠道（微信、支付宝等）
     */
    @ApiModelProperty(name = "channelCode", value = "渠道（微信、支付宝等）")
    private String channelCode;
    /**
     * 系统
     */
    @ApiModelProperty(name = "appId", value = "系统")
    private String appId;
    /**
     * 渠道费率
     */
    @ApiModelProperty(name = "rate", value = "渠道费率")
    private BigDecimal rate;
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
    /**
     * 支付配置编号
     */
    @ApiModelProperty(name = "channeldetailCode", value = "支付配置编号")
    private String channeldetailCode;
    /**
     * 账户名称
     */
    @ApiModelProperty(name = "accountName", value = "账户名称")
    private String accountName;


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

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRate() {
        return this.rate;
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

    public void setChanneldetailCode(String channeldetailCode) {
        this.channeldetailCode = channeldetailCode;
    }

    public String getChanneldetailCode() {
        return this.channeldetailCode;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }


}