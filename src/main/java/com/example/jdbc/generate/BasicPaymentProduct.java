package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付产品表实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "支付产品表实体", description = "支付产品表")
public class BasicPaymentProduct {
    /**
     * 主键id
     */
    @ApiModelProperty(name = "id", value = "主键id")
    private Long id;
    /**
     * 支付订单编号
     */
    @ApiModelProperty(name = "payOrderNo", value = "支付订单编号")
    private String payOrderNo;
    /**
     * 业务订单编号
     */
    @ApiModelProperty(name = "businessOrderNo", value = "业务订单编号")
    private String businessOrderNo;
    /**
     * 产品名称
     */
    @ApiModelProperty(name = "productName", value = "产品名称")
    private String productName;
    /**
     * 产品数量
     */
    @ApiModelProperty(name = "productNum", value = "产品数量")
    private Integer productNum;
    /**
     * 产品单价
     */
    @ApiModelProperty(name = "productUnitPrice", value = "产品单价")
    private BigDecimal productUnitPrice;
    /**
     * 产品描述
     */
    @ApiModelProperty(name = "productDesc", value = "产品描述")
    private String productDesc;
    /**
     * 产品备注
     */
    @ApiModelProperty(name = "productRemark", value = "产品备注")
    private String productRemark;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "createTime", value = "创建时间")
    private Date createTime;
    /**
     * 删除标志，0为未删除
     */
    @ApiModelProperty(name = "deleteFlag", value = "删除标志，0为未删除")
    private Integer deleteFlag;
    /**
     * 操作人
     */
    @ApiModelProperty(name = "operator", value = "操作人")
    private String operator;
    /**
     * 创建人
     */
    @ApiModelProperty(name = "creator", value = "创建人")
    private String creator;
    /**
     * 
     */
    @ApiModelProperty(name = "operateTime", value = "")
    private String operateTime;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getPayOrderNo() {
        return this.payOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessOrderNo() {
        return this.businessOrderNo;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Integer getProductNum() {
        return this.productNum;
    }

    public void setProductUnitPrice(BigDecimal productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public BigDecimal getProductUnitPrice() {
        return this.productUnitPrice;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public void setProductRemark(String productRemark) {
        this.productRemark = productRemark;
    }

    public String getProductRemark() {
        return this.productRemark;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateTime() {
        return this.operateTime;
    }


}