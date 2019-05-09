package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 付款单据表实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "付款单据表实体", description = "付款单据表")
public class BizFinanceReceipt {
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
     * 单据类型
     */
    @ApiModelProperty(name = "receiptType", value = "单据类型")
    private String receiptType;
    /**
     * 业务单据号
     */
    @ApiModelProperty(name = "receiptCode", value = "业务单据号")
    private String receiptCode;


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

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getReceiptType() {
        return this.receiptType;
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }

    public String getReceiptCode() {
        return this.receiptCode;
    }


}