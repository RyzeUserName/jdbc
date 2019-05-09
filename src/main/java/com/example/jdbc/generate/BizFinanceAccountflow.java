package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 账户流水实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "账户流水实体", description = "账户流水")
public class BizFinanceAccountflow {
    /**
     * 主键
     */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;
    /**
     * 
     */
    @ApiModelProperty(name = "orderNo", value = "")
    private String orderNo;
    /**
     * 账户流水号
     */
    @ApiModelProperty(name = "accountSerialNumber", value = "账户流水号")
    private String accountSerialNumber;
    /**
     * 账户编码


     */
    @ApiModelProperty(name = "accountSerialCode", value = "账户编码

")
    private String accountSerialCode;
    /**
     * 余额变动金额（正的 增加 负的减少）
     */
    @ApiModelProperty(name = "balanceChangeAmount", value = "余额变动金额（正的 增加 负的减少）")
    private Long balanceChangeAmount;
    /**
     * 余额
     */
    @ApiModelProperty(name = "balance", value = "余额")
    private Long balance;
    /**
     * 交易类型JY 开头
     */
    @ApiModelProperty(name = "transactionType", value = "交易类型JY 开头")
    private String transactionType;
    /**
     * 业务类型
     */
    @ApiModelProperty(name = "transactionName", value = "业务类型")
    private String transactionName;
    /**
     * 业务来源单据号
     */
    @ApiModelProperty(name = "businessSourceDocumentNumber", value = "业务来源单据号")
    private String businessSourceDocumentNumber;
    /**
     * 业务场景统号 YW 开头
     */
    @ApiModelProperty(name = "businessCode", value = "业务场景统号 YW 开头")
    private String businessCode;
    /**
     * 业务场景名称
     */
    @ApiModelProperty(name = "businessName", value = "业务场景名称")
    private String businessName;
    /**
     * 收款人帐号
     */
    @ApiModelProperty(name = "payeeName", value = "收款人帐号")
    private String payeeName;
    /**
     * 收款人名称
     */
    @ApiModelProperty(name = "payeeAccount", value = "收款人名称")
    private String payeeAccount;
    /**
     * 付款人名称
     */
    @ApiModelProperty(name = "payerName", value = "付款人名称")
    private String payerName;
    /**
     * 付款人帐号
     */
    @ApiModelProperty(name = "payerAccount", value = "付款人帐号")
    private String payerAccount;
    /**
     * 帐户流水normal正常的收付流水 refund退款流水
     */
    @ApiModelProperty(name = "accountFlowType", value = "帐户流水normal正常的收付流水 refund退款流水")
    private String accountFlowType;
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


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setAccountSerialNumber(String accountSerialNumber) {
        this.accountSerialNumber = accountSerialNumber;
    }

    public String getAccountSerialNumber() {
        return this.accountSerialNumber;
    }

    public void setAccountSerialCode(String accountSerialCode) {
        this.accountSerialCode = accountSerialCode;
    }

    public String getAccountSerialCode() {
        return this.accountSerialCode;
    }

    public void setBalanceChangeAmount(Long balanceChangeAmount) {
        this.balanceChangeAmount = balanceChangeAmount;
    }

    public Long getBalanceChangeAmount() {
        return this.balanceChangeAmount;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getTransactionName() {
        return this.transactionName;
    }

    public void setBusinessSourceDocumentNumber(String businessSourceDocumentNumber) {
        this.businessSourceDocumentNumber = businessSourceDocumentNumber;
    }

    public String getBusinessSourceDocumentNumber() {
        return this.businessSourceDocumentNumber;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getBusinessCode() {
        return this.businessCode;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return this.businessName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeName() {
        return this.payeeName;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

    public String getPayeeAccount() {
        return this.payeeAccount;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerName() {
        return this.payerName;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public String getPayerAccount() {
        return this.payerAccount;
    }

    public void setAccountFlowType(String accountFlowType) {
        this.accountFlowType = accountFlowType;
    }

    public String getAccountFlowType() {
        return this.accountFlowType;
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


}