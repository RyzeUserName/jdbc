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
public class BizServiceProjectcode {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 编号的前缀，值为枚举中的值
     */
    @ApiModelProperty(name = "codePrefix", value = "编号的前缀，值为枚举中的值")
    private String codePrefix;
    /**
     * 
     */
    @ApiModelProperty(name = "currentCount", value = "")
    private Long currentCount;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "createTime", value = "创建时间")
    private Date createTime;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "updateTime", value = "更新时间")
    private Date updateTime;
    /**
     * 1：正常  0：失败
     */
    @ApiModelProperty(name = "codeStatus", value = "1：正常  0：失败")
    private Integer codeStatus;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setCodePrefix(String codePrefix) {
        this.codePrefix = codePrefix;
    }

    public String getCodePrefix() {
        return this.codePrefix;
    }

    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    public Long getCurrentCount() {
        return this.currentCount;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setCodeStatus(Integer codeStatus) {
        this.codeStatus = codeStatus;
    }

    public Integer getCodeStatus() {
        return this.codeStatus;
    }


}