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
public class BasicPaymentConfiguration {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 系统
     */
    @ApiModelProperty(name = "appId", value = "系统")
    private String appId;
    /**
     * 
     */
    @ApiModelProperty(name = "appName", value = "")
    private String appName;
    /**
     * 签名
     */
    @ApiModelProperty(name = "secret", value = "签名")
    private String secret;
    /**
     * 状态0启用，1禁用，默认启用
     */
    @ApiModelProperty(name = "status", value = "状态0启用，1禁用，默认启用")
    private Long status;
    /**
     * 业务场景
     */
    @ApiModelProperty(name = "businessScene", value = "业务场景")
    private String businessScene;
    /**
     * 业务类型
     */
    @ApiModelProperty(name = "businessType", value = "业务类型")
    private String businessType;
    /**
     * 账户类型
     */
    @ApiModelProperty(name = "accountType", value = "账户类型")
    private String accountType;
    /**
     * 账户
     */
    @ApiModelProperty(name = "account", value = "账户")
    private String account;
    /**
     * 账户名称
     */
    @ApiModelProperty(name = "accountName", value = "账户名称")
    private String accountName;
    /**
     * 余额变动结果（方向）增加（+）减少（-）
     */
    @ApiModelProperty(name = "accountBalanceChange", value = "余额变动结果（方向）增加（+）减少（-）")
    private String accountBalanceChange;
    /**
     * 
     */
    @ApiModelProperty(name = "tradeType", value = "")
    private String tradeType;
    /**
     * 交易方式	内部(0)、第三方(1)
     */
    @ApiModelProperty(name = "payType", value = "交易方式	内部(0)、第三方(1)")
    private String payType;
    /**
     * 内部账户流水变动 true, false
     */
    @ApiModelProperty(name = "innerFlow", value = "内部账户流水变动 true, false")
    private String innerFlow;
    /**
     * 消息队列
     */
    @ApiModelProperty(name = "messageQueue", value = "消息队列")
    private String messageQueue;
    /**
     * 描述
     */
    @ApiModelProperty(name = "description", value = "描述")
    private String description;
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
    @ApiModelProperty(name = "operateTime", value = "")
    private Date operateTime;
    /**
     * 
     */
    @ApiModelProperty(name = "createTime", value = "")
    private Date createTime;
    /**
     * 业务单据类型
     */
    @ApiModelProperty(name = "billType", value = "业务单据类型")
    private String billType;
    /**
     * 配置编号
     */
    @ApiModelProperty(name = "configCode", value = "配置编号")
    private String configCode;


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

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
    }

    public String getBusinessScene() {
        return this.businessScene;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountBalanceChange(String accountBalanceChange) {
        this.accountBalanceChange = accountBalanceChange;
    }

    public String getAccountBalanceChange() {
        return this.accountBalanceChange;
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

    public void setInnerFlow(String innerFlow) {
        this.innerFlow = innerFlow;
    }

    public String getInnerFlow() {
        return this.innerFlow;
    }

    public void setMessageQueue(String messageQueue) {
        this.messageQueue = messageQueue;
    }

    public String getMessageQueue() {
        return this.messageQueue;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
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

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillType() {
        return this.billType;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getConfigCode() {
        return this.configCode;
    }


}