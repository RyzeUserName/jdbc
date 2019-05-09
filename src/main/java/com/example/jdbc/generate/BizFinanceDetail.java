package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 付款明细表实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "付款明细表实体", description = "付款明细表")
public class BizFinanceDetail {
    /**
     * 主键
     */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;
    /**
     * 所属付款单单号
     */
    @ApiModelProperty(name = "billsCode", value = "所属付款单单号")
    private String billsCode;
    /**
     * 数据版本号
     */
    @ApiModelProperty(name = "versions", value = "数据版本号")
    private Long versions;
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
     * 金额
     */
    @ApiModelProperty(name = "money", value = "金额")
    private Double money;
    /**
     * 逻辑删除
     */
    @ApiModelProperty(name = "deleteFlag", value = "逻辑删除")
    private Integer deleteFlag;
    /**
     * 结算方式
     */
    @ApiModelProperty(name = "paymentMode", value = "结算方式")
    private String paymentMode;
    /**
     * 结算账户
     */
    @ApiModelProperty(name = "paymentAccount", value = "结算账户")
    private String paymentAccount;
    /**
     * 账号编码
     */
    @ApiModelProperty(name = "accountNumberCode", value = "账号编码")
    private String accountNumberCode;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setBillsCode(String billsCode) {
        this.billsCode = billsCode;
    }

    public String getBillsCode() {
        return this.billsCode;
    }

    public void setVersions(Long versions) {
        this.versions = versions;
    }

    public Long getVersions() {
        return this.versions;
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

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getMoney() {
        return this.money;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getPaymentAccount() {
        return this.paymentAccount;
    }

    public void setAccountNumberCode(String accountNumberCode) {
        this.accountNumberCode = accountNumberCode;
    }

    public String getAccountNumberCode() {
        return this.accountNumberCode;
    }


}