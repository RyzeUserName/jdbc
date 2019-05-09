package com.example.jdbc.data.jdbc.data;

import java.util.List;

/**
 * 枚举
 * @author Ryze
 * @date 2018/7/13 16:35
 */
public class EnumAttribute {
    private String enumName;
    private String enumRemark;
    private List<String> enumValues;

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getEnumRemark() {
        return enumRemark;
    }

    public void setEnumRemark(String enumRemark) {
        this.enumRemark = enumRemark;
    }

    public List<String> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(List<String> enumValues) {
        this.enumValues = enumValues;
    }
}
