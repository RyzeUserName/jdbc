package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 内部账户实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "内部账户实体", description = "内部账户")
public class BizFinanceAccount {
    /**
     * 主键
     */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;
    /**
     * 账户编码
     */
    @ApiModelProperty(name = "accountCode", value = "账户编码")
    private String accountCode;
    /**
     * 账户名称
     */
    @ApiModelProperty(name = "accountName", value = "账户名称")
    private String accountName;
    /**
     * 业务类型（售后 AFTER_SALE/营销 MARKETING/ 租赁 LEASE）
     */
    @ApiModelProperty(name = "businessType", value = "业务类型（售后 AFTER_SALE/营销 MARKETING/ 租赁 LEASE）")
    private String businessType;
    /**
     * 账号业务具体类型(客户经理 ACCOUNT_MANAGER/服务中心SERVICE_CENTER/租赁门店 STORE)
     */
    @ApiModelProperty(name = "businessItemType", value = "账号业务具体类型(客户经理 ACCOUNT_MANAGER/服务中心SERVICE_CENTER/租赁门店 STORE)")
    private String businessItemType;
    /**
     * 组织或个人的编码
     */
    @ApiModelProperty(name = "organizationCode", value = "组织或个人的编码")
    private String organizationCode;
    /**
     * 组织或个人的名称
     */
    @ApiModelProperty(name = "organizationName", value = "组织或个人的名称")
    private String organizationName;
    /**
     * 账户余额
     */
    @ApiModelProperty(name = "accountBalance", value = "账户余额")
    private Long accountBalance;
    /**
     * 账户类型 （零钱SMALL_CHANGE/预收款 PREPAID_FEE）
     */
    @ApiModelProperty(name = "accountType", value = "账户类型 （零钱SMALL_CHANGE/预收款 PREPAID_FEE）")
    private String accountType;
    /**
     * 账户是 个人PERSONAL/组织 ORGANIZATION/平台 PLATFORM
     */
    @ApiModelProperty(name = "organizationType", value = "账户是 个人PERSONAL/组织 ORGANIZATION/平台 PLATFORM")
    private String organizationType;
    /**
     * 帐户密码
     */
    @ApiModelProperty(name = "accountPwd", value = "帐户密码")
    private String accountPwd;
    /**
     * 密码设置时间
     */
    @ApiModelProperty(name = "pwdSetTime", value = "密码设置时间")
    private Date pwdSetTime;
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
    @ApiModelProperty(name = "deleteFlag", value = "")
    private Integer deleteFlag;
    /**
     * 系统appId
     */
    @ApiModelProperty(name = "appId", value = "系统appId")
    private String appId;
    /**
     * 账户控制编码
     */
    @ApiModelProperty(name = "accountControlCode", value = "账户控制编码")
    private String accountControlCode;
    /**
     * 账户状态 NORMAL FREEZE
     */
    @ApiModelProperty(name = "accountStatus", value = "账户状态 NORMAL FREEZE")
    private String accountStatus;
    /**
     * 透支额度
     */
    @ApiModelProperty(name = "overdraftAmount", value = "透支额度")
    private Long overdraftAmount;
    /**
     * 渠道
     */
    @ApiModelProperty(name = "accountChannel", value = "渠道")
    private String accountChannel;
    /**
     * 渠道手续费账户编码
     */
    @ApiModelProperty(name = "associatedFeeCode", value = "渠道手续费账户编码")
    private String associatedFeeCode;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountCode() {
        return this.accountCode;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBusinessItemType(String businessItemType) {
        this.businessItemType = businessItemType;
    }

    public String getBusinessItemType() {
        return this.businessItemType;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return this.organizationName;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Long getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrganizationType() {
        return this.organizationType;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd;
    }

    public String getAccountPwd() {
        return this.accountPwd;
    }

    public void setPwdSetTime(Date pwdSetTime) {
        this.pwdSetTime = pwdSetTime;
    }

    public Date getPwdSetTime() {
        return this.pwdSetTime;
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

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAccountControlCode(String accountControlCode) {
        this.accountControlCode = accountControlCode;
    }

    public String getAccountControlCode() {
        return this.accountControlCode;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return this.accountStatus;
    }

    public void setOverdraftAmount(Long overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public Long getOverdraftAmount() {
        return this.overdraftAmount;
    }

    public void setAccountChannel(String accountChannel) {
        this.accountChannel = accountChannel;
    }

    public String getAccountChannel() {
        return this.accountChannel;
    }

    public void setAssociatedFeeCode(String associatedFeeCode) {
        this.associatedFeeCode = associatedFeeCode;
    }

    public String getAssociatedFeeCode() {
        return this.associatedFeeCode;
    }


}