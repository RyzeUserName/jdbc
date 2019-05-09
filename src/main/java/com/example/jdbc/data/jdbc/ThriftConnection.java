package com.example.jdbc.data.jdbc;

import com.example.jdbc.data.covert.DataCovert;
import com.example.jdbc.data.covert.ThriftDataCovert;
import com.example.jdbc.data.jdbc.data.Attribute;
import com.example.jdbc.data.jdbc.data.Table;
import org.apache.commons.lang3.StringUtils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * thrift 连接
 * @author Ryze
 * @date 2018/6/22 17:27
 */
public class ThriftConnection implements MyConnection {
    /**
     * 关系表前缀
     */
    private static final String REL = "rel";
    private static final String SPACE = "_";
    private static final String TABLE = "TABLE";
    private static final String SCHEMA_PATTERN = "%";
    private String driver = "com.mysql.jdbc.Driver";
    private String url;
    private String username;
    private String password;
    private DataCovert dataCovert;

    public static ThriftConnection buildJdbcConnection(String driver, String url, String username, String password) {
        return new ThriftConnection(driver, url, username, password);
    }

    public ThriftConnection(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.dataCovert = new ThriftDataCovert();
    }

    public ThriftConnection(String driver, String url, String username, String password, DataCovert dataCovert) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.dataCovert = dataCovert;
    }

    @Override
    public List<Table> getTables() throws Exception {
        url = url + "?useUnicode=true&amp;characterEncoding=UTF-8&useInformationSchema=true";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        // 获取数据库信息
        DatabaseMetaData metaData = con.getMetaData();
        ResultSet rs = metaData.getTables(null, null, null, new String[]{TABLE});
        List<Table> tables = new ArrayList<>();
        Table tab = null;
        List<Attribute> columnList;
        //遍历表
        while (rs.next()) {
            final String result = rs.getString(4);
            final boolean bFlag = result != null && (result.equalsIgnoreCase(TABLE));
            if (bFlag) {
                String tableName = rs.getString(3).toLowerCase();
                String remarkes = rs.getString("REMARKS");
                if (StringUtils.startsWith(tableName, REL)) {
                    continue;
                }
                tab = new Table();
                Set<String> strings = new HashSet<>();
                tab.setTableName(toClassCase(tableName));
                tab.setTableRemarks(remarkes);
                columnList = new ArrayList<>();
                //获取列
                ResultSet colRet = metaData.getColumns(null, SCHEMA_PATTERN, tableName, SCHEMA_PATTERN);
                Attribute col;
                //遍历列
                List<String> sqlCol = new ArrayList<>();
                List<String> enCol = new ArrayList<>();
                //sql 组装
                while (colRet.next()) {
                    col = new Attribute();
                    String columnName = colRet.getString("COLUMN_NAME");
                    String columnType = colRet.getString("TYPE_NAME");
                    String remarks = colRet.getString("REMARKS");
                    col.setRemark(remarks);
                    String camelCase = toCamelCase(columnName);
                    if (!"id".equals(columnName)) {
                        sqlCol.add(columnName);
                        enCol.add(" :" + camelCase);
                    }
                    col.setName(camelCase);
                    String type = dataCovert.covert(columnType);
                    try {
                        switchType(strings, type);
                    }catch (Exception e){
                        System.out.println(tableName+"----"+columnName);
                    }
                    col.setType(type);
                    col.setThriftType(dataCovert.covert(type + "thrift"));
                    columnList.add(col);
                }
                tab.setImportType(strings);
                List insert_into = constructorSql(null, "INSERT INTO " + tableName + " ( ");
                insert_into = getList(sqlCol, insert_into);
                insert_into = constructorSql(insert_into, " ) VALUES ( ");
                insert_into = getList(enCol, insert_into);
                insert_into = constructorSql(insert_into, " )");
                tab.setAddSql(insert_into);
                List<String> collect = sqlCol.stream().map(a -> a + " = :" + toCamelCase(a)).collect(Collectors.toList());
                List update_set = constructorSql(null, "UPDATE " + tableName + " SET ");
                update_set = getList(collect, update_set);
                update_set = constructorSql(update_set, " WHERE id= :id");
                tab.setUpdateSql(update_set);
                List detals = constructorSql(null, "SELECT id,");
                detals = getList(sqlCol, detals);
                detals = constructorSql(detals, " FROM " + tableName);
                detals = constructorSql(detals, " WHERE id= :id");
                tab.setDetailSql(detals);
                List delete = constructorSql(null, "DELETE  FROM " + tableName + " WHERE id= :id ");
                tab.setDeleteSql(delete);
                tab.setColumns(columnList);
            }
            tables.add(tab);
        }
        return tables;
    }
}
