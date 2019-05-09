package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 账户类型控制实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "账户类型控制实体", description = "账户类型控制")
public class BizAccountControl {
    /**
     * id
     */
    @ApiModelProperty(name = "id", value = "id")
    private Long id;
    /**
     * 编码
     */
    @ApiModelProperty(name = "typeCode", value = "编码")
    private String typeCode;
    /**
     * 账户类型名称
     */
    @ApiModelProperty(name = "typeName", value = "账户类型名称")
    private String typeName;
    /**
     * 信息管理属性:内/外部
     */
    @ApiModelProperty(name = "internalExternal", value = "信息管理属性:内/外部")
    private String internalExternal;
    /**
     * 货币单位
     */
    @ApiModelProperty(name = "feeType", value = "货币单位")
    private String feeType;
    /**
     * 适用账户主体类型“业务平台”、“直营机构”、“加盟机构”、“供应商”、“会员”
     */
    @ApiModelProperty(name = "accountBodyType", value = "适用账户主体类型“业务平台”、“直营机构”、“加盟机构”、“供应商”、“会员”")
    private String accountBodyType;
    /**
     * 适用账户主体类型“业务平台”、“直营机构”、“加盟机构”、“供应商”、“会员”
     */
    @ApiModelProperty(name = "accountBodyName", value = "适用账户主体类型“业务平台”、“直营机构”、“加盟机构”、“供应商”、“会员”")
    private String accountBodyName;
    /**
     *  是否允许充值 
     */
    @ApiModelProperty(name = "rechargeFlag", value = " 是否允许充值 ")
    private Integer rechargeFlag;
    /**
     * 是否允许提现
     */
    @ApiModelProperty(name = "withdrawFlag", value = "是否允许提现")
    private Integer withdrawFlag;
    /**
     * 是否允许支付
     */
    @ApiModelProperty(name = "payFlag", value = "是否允许支付")
    private Integer payFlag;
    /**
     * 是否允许退款
     */
    @ApiModelProperty(name = "refundFlag", value = "是否允许退款")
    private Integer refundFlag;
    /**
     * 是否允许转账转入
     */
    @ApiModelProperty(name = "transferInFlag", value = "是否允许转账转入")
    private Integer transferInFlag;
    /**
     * 是否允许转账转出
     */
    @ApiModelProperty(name = "transferOutFlag", value = "是否允许转账转出")
    private Integer transferOutFlag;
    /**
     * 是否允许透支
     */
    @ApiModelProperty(name = "overdraftFlag", value = "是否允许透支")
    private Integer overdraftFlag;
    /**
     * 是否冻结
     */
    @ApiModelProperty(name = "freezeFlag", value = "是否冻结")
    private Integer freezeFlag;
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

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setInternalExternal(String internalExternal) {
        this.internalExternal = internalExternal;
    }

    public String getInternalExternal() {
        return this.internalExternal;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeType() {
        return this.feeType;
    }

    public void setAccountBodyType(String accountBodyType) {
        this.accountBodyType = accountBodyType;
    }

    public String getAccountBodyType() {
        return this.accountBodyType;
    }

    public void setAccountBodyName(String accountBodyName) {
        this.accountBodyName = accountBodyName;
    }

    public String getAccountBodyName() {
        return this.accountBodyName;
    }

    public void setRechargeFlag(Integer rechargeFlag) {
        this.rechargeFlag = rechargeFlag;
    }

    public Integer getRechargeFlag() {
        return this.rechargeFlag;
    }

    public void setWithdrawFlag(Integer withdrawFlag) {
        this.withdrawFlag = withdrawFlag;
    }

    public Integer getWithdrawFlag() {
        return this.withdrawFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    public Integer getPayFlag() {
        return this.payFlag;
    }

    public void setRefundFlag(Integer refundFlag) {
        this.refundFlag = refundFlag;
    }

    public Integer getRefundFlag() {
        return this.refundFlag;
    }

    public void setTransferInFlag(Integer transferInFlag) {
        this.transferInFlag = transferInFlag;
    }

    public Integer getTransferInFlag() {
        return this.transferInFlag;
    }

    public void setTransferOutFlag(Integer transferOutFlag) {
        this.transferOutFlag = transferOutFlag;
    }

    public Integer getTransferOutFlag() {
        return this.transferOutFlag;
    }

    public void setOverdraftFlag(Integer overdraftFlag) {
        this.overdraftFlag = overdraftFlag;
    }

    public Integer getOverdraftFlag() {
        return this.overdraftFlag;
    }

    public void setFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    public Integer getFreezeFlag() {
        return this.freezeFlag;
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