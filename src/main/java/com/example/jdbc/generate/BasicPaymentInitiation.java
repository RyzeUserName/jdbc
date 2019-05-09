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
public class BasicPaymentInitiation {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 业务系统id
     */
    @ApiModelProperty(name = "appId", value = "业务系统id")
    private String appId;
    /**
     * 移钥
     */
    @ApiModelProperty(name = "privateKey", value = "移钥")
    private String privateKey;
    /**
     * 公钥
     */
    @ApiModelProperty(name = "publicKey", value = "公钥")
    private String publicKey;
    /**
     * 状态，启用，停用
     */
    @ApiModelProperty(name = "status", value = "状态，启用，停用")
    private String status;
    /**
     * 删除标记
     */
    @ApiModelProperty(name = "deleteFlag", value = "删除标记")
    private String deleteFlag;
    /**
     * 操作人
     */
    @ApiModelProperty(name = "operator", value = "操作人")
    private String operator;
    /**
     * 操作时间
     */
    @ApiModelProperty(name = "operateTime", value = "操作时间")
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

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag() {
        return this.deleteFlag;
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


}