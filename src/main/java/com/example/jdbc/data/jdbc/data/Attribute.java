package com.example.jdbc.data.jdbc.data;

/**
 * 表字段的信息
 * @author lifutian
 * @date 2018/5/10 9:59
 */
public class Attribute {
    private String type;
    private String thriftType;
    private String name;
    private String columnName;
    private String remark;
    private String value;

    public Attribute() {
        super();
    }

    public Attribute(String type, String thriftType, String name, String remark) {
        this.type = type;
        this.thriftType = thriftType;
        this.name = name;
        this.remark = remark;
    }

    public String getThriftType() {
        return thriftType;
    }

    public void setThriftType(String thriftType) {
        this.thriftType = thriftType;
    }

    public String getType() {
        return type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
