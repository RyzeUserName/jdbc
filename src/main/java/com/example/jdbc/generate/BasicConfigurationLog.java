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
public class BasicConfigurationLog {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 
     */
    @ApiModelProperty(name = "configId", value = "")
    private Long configId;
    /**
     * 创建人
     */
    @ApiModelProperty(name = "creator", value = "创建人")
    private String creator;
    /**
     * 更新人
     */
    @ApiModelProperty(name = "operator", value = "更新人")
    private String operator;
    /**
     * 操作（新增、编辑、开启、删除）
     */
    @ApiModelProperty(name = "operation", value = "操作（新增、编辑、开启、删除）")
    private String operation;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "createTime", value = "创建时间")
    private Date createTime;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "operateTime", value = "更新时间")
    private Date operateTime;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public Long getConfigId() {
        return this.configId;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return this.operation;
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