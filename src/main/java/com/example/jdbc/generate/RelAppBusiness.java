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
public class RelAppBusiness {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 平台id
     */
    @ApiModelProperty(name = "appId", value = "平台id")
    private String appId;
    /**
     * 平台名称
     */
    @ApiModelProperty(name = "appName", value = "平台名称")
    private String appName;
    /**
     * 2位平台系统编码+3位业务
     */
    @ApiModelProperty(name = "businessCode", value = "2位平台系统编码+3位业务")
    private String businessCode;
    /**
     * 业务中文
     */
    @ApiModelProperty(name = "businessName", value = "业务中文")
    private String businessName;
    /**
     * 交易类型
     */
    @ApiModelProperty(name = "tradeCode", value = "交易类型")
    private String tradeCode;
    /**
     * 交易名称
     */
    @ApiModelProperty(name = "tradeName", value = "交易名称")
    private String tradeName;
    /**
     * 消息队列
     */
    @ApiModelProperty(name = "messageQueue", value = "消息队列")
    private String messageQueue;
    /**
     * 状态0启用，1禁用，默认启用
     */
    @ApiModelProperty(name = "status", value = "状态0启用，1禁用，默认启用")
    private Long status;
    /**
     * 业务类型(0)、交易类型(1)
     */
    @ApiModelProperty(name = "type", value = "业务类型(0)、交易类型(1)")
    private Long type;
    /**
     * 交易方式	内部(0)、第三方(1)
     */
    @ApiModelProperty(name = "payType", value = "交易方式	内部(0)、第三方(1)")
    private String payType;
    /**
     * 余额变动结果（方向）增加（+）减少（-）
     */
    @ApiModelProperty(name = "accountBalanceChange", value = "余额变动结果（方向）增加（+）减少（-）")
    private String accountBalanceChange;
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
    @ApiModelProperty(name = "createTime", value = "")
    private Date createTime;
    /**
     * 
     */
    @ApiModelProperty(name = "operateTime", value = "")
    private Date operateTime;


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

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getTradeCode() {
        return this.tradeCode;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeName() {
        return this.tradeName;
    }

    public void setMessageQueue(String messageQueue) {
        this.messageQueue = messageQueue;
    }

    public String getMessageQueue() {
        return this.messageQueue;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setAccountBalanceChange(String accountBalanceChange) {
        this.accountBalanceChange = accountBalanceChange;
    }

    public String getAccountBalanceChange() {
        return this.accountBalanceChange;
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


}