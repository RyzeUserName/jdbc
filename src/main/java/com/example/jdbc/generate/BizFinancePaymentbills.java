package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 付款单表（营销付款、售后预付款、售后退款）实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "付款单表（营销付款、售后预付款、售后退款）实体", description = "付款单表（营销付款、售后预付款、售后退款）")
public class BizFinancePaymentbills {
    /**
     * 主键
     */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;
    /**
     * 单号
     */
    @ApiModelProperty(name = "billsCode", value = "单号")
    private String billsCode;
    /**
     * 订单生成时间
     */
    @ApiModelProperty(name = "billsDate", value = "订单生成时间")
    private Date billsDate;
    /**
     * 供应商编号
     */
    @ApiModelProperty(name = "supplierCode", value = "供应商编号")
    private String supplierCode;
    /**
     * 供应商名称
     */
    @ApiModelProperty(name = "supplierName", value = "供应商名称")
    private String supplierName;
    /**
     * 业务类型，java枚举
     */
    @ApiModelProperty(name = "businessType", value = "业务类型，java枚举")
    private String businessType;
    /**
     * 账单类型，用来区分是营销付款还是售后付款
     */
    @ApiModelProperty(name = "billsType", value = "账单类型，用来区分是营销付款还是售后付款")
    private String billsType;
    /**
     * 状态，是否处理成功
     */
    @ApiModelProperty(name = "billsStatus", value = "状态，是否处理成功")
    private Long billsStatus;
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
     * 付款或者预付款金额
     */
    @ApiModelProperty(name = "money", value = "付款或者预付款金额")
    private Double money;
    /**
     * 逻辑删除
     */
    @ApiModelProperty(name = "deleteFlag", value = "逻辑删除")
    private Integer deleteFlag;


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

    public void setBillsDate(Date billsDate) {
        this.billsDate = billsDate;
    }

    public Date getBillsDate() {
        return this.billsDate;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierCode() {
        return this.supplierCode;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBillsType(String billsType) {
        this.billsType = billsType;
    }

    public String getBillsType() {
        return this.billsType;
    }

    public void setBillsStatus(Long billsStatus) {
        this.billsStatus = billsStatus;
    }

    public Long getBillsStatus() {
        return this.billsStatus;
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


}