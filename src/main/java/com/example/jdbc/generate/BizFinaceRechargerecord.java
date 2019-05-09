package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 充值记录实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "充值记录实体", description = "充值记录")
public class BizFinaceRechargerecord {
    /**
     * 主键
     */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;
    /**
     * 充值单号
     */
    @ApiModelProperty(name = "rechargeNumber", value = "充值单号")
    private String rechargeNumber;
    /**
     * 内部账户编码
     */
    @ApiModelProperty(name = "accountCode", value = "内部账户编码")
    private String accountCode;
    /**
     * 充值金额
     */
    @ApiModelProperty(name = "rechargeAmount", value = "充值金额")
    private Double rechargeAmount;
    /**
     * 账号
     */
    @ApiModelProperty(name = "accountNumberCode", value = "账号")
    private String accountNumberCode;
    /**
     * 充值凭证
     */
    @ApiModelProperty(name = "rechargePicture", value = "充值凭证")
    private String rechargePicture;
    /**
     * 备注
     */
    @ApiModelProperty(name = "remark", value = "备注")
    private String remark;
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

    public void setRechargeNumber(String rechargeNumber) {
        this.rechargeNumber = rechargeNumber;
    }

    public String getRechargeNumber() {
        return this.rechargeNumber;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountCode() {
        return this.accountCode;
    }

    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Double getRechargeAmount() {
        return this.rechargeAmount;
    }

    public void setAccountNumberCode(String accountNumberCode) {
        this.accountNumberCode = accountNumberCode;
    }

    public String getAccountNumberCode() {
        return this.accountNumberCode;
    }

    public void setRechargePicture(String rechargePicture) {
        this.rechargePicture = rechargePicture;
    }

    public String getRechargePicture() {
        return this.rechargePicture;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
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