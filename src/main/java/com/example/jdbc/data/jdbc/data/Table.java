package com.example.jdbc.data.jdbc.data;

import com.example.jdbc.data.jdbc.data.Attribute;
import com.example.jdbc.data.jdbc.data.EnumAttribute;
import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 表 对象
 * @author lifutian
 * @date 2018/5/10 10:00
 */
public class Table {
    private String tableName;
    private String tableOgrName;
    private String tableServiceName;
    private String tableRemarks;
    private Set<String> importType = new HashSet<>();
    private List<Attribute> columns;
    private List<String> addSql;
    private List<String> updateSql;
    private List<String> detailSql;
    private List<String> pageSql;
    private List<String> deleteSql;
    private List<String> deleteFalseSql;
    private List<EnumAttribute> enumAttributes= Lists.newArrayList();

    public List<String> getPageSql() {
        return pageSql;
    }

    public void setPageSql(List<String> pageSql) {
        this.pageSql = pageSql;
    }

    public String getTableServiceName() {
        return tableServiceName;
    }

    public List<String> getDeleteFalseSql() {
        return deleteFalseSql;
    }

    public void setDeleteFalseSql(List<String> deleteFalseSql) {
        this.deleteFalseSql = deleteFalseSql;
    }

    public void setTableServiceName(String tableServiceName) {
        this.tableServiceName = tableServiceName;
    }

    public String getTableOgrName() {
        return tableOgrName;
    }

    public void setTableOgrName(String tableOgrName) {
        this.tableOgrName = tableOgrName;
    }

    public Set<String> getImportType() {
        return importType;
    }

    public void setImportType(Set<String> importType) {
        this.importType = importType;
    }

    public String getTableRemarks() {
        return tableRemarks;
    }

    public void setTableRemarks(String tableRemarks) {
        this.tableRemarks = tableRemarks;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Attribute> getColumns() {
        return columns;
    }

    public void setColumns(List<Attribute> columns) {
        this.columns = columns;
    }

    public List<String> getAddSql() {
        return addSql;
    }

    public void setAddSql(List<String> addSql) {
        this.addSql = addSql;
    }

    public List<String> getUpdateSql() {
        return updateSql;
    }

    public void setUpdateSql(List<String> updateSql) {
        this.updateSql = updateSql;
    }

    public List<String> getDetailSql() {
        return detailSql;
    }

    public void setDetailSql(List<String> detailSql) {
        this.detailSql = detailSql;
    }

    public List<String> getDeleteSql() {
        return deleteSql;
    }

    public void setDeleteSql(List<String> deleteSql) {
        this.deleteSql = deleteSql;
    }

    public List<EnumAttribute> getEnumAttributes() {
        return enumAttributes;
    }

    public void setEnumAttributes(List<EnumAttribute> enumAttributes) {
        this.enumAttributes = enumAttributes;
    }
}
