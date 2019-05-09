package com.example.jdbc.data.jdbc;

import com.example.jdbc.data.covert.DataCovert;
import com.example.jdbc.data.jdbc.data.Attribute;
import com.example.jdbc.data.jdbc.data.EnumAttribute;
import com.example.jdbc.data.jdbc.data.Table;
import org.apache.commons.lang3.StringUtils;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 连接
 * @author Ryze
 * @date 2018-06-27 15:59:00
 * @version V1.0.0
 */
public interface MyConnection {
    /**
     * 关系表前缀
     */
    String REL = "rel";
    String SPACE = "_";
    String TABLE = "TABLE";
    String SCHEMA_PATTERN = "%";

    default String toCamelCase(String str) {
        if (str == null || !str.contains("_")) {
            return str;
        }
        StringBuffer buf = new StringBuffer();
        char[] charArray = str.toCharArray();
        for (int i = 0, len = charArray.length; i < len - 1; i++) {
            final boolean flag = charArray[i] == '_' && (charArray[i + 1] >= 'a' && charArray[i + 1] < 'z');
            if (flag) {
                charArray[i + 1] = (char) (charArray[i + 1] - 32);
            }
            if (charArray[i] != '_') {
                buf.append(charArray[i]);
            }
        }
        buf.append(charArray[charArray.length - 1]);
        return buf.toString();
    }

    /**转换类名
     * @param str
     * @return
     */
    default String toClassCase(String str) {
        String camelCase = toCamelCase(str);
        String substring = camelCase.substring(0, 1);
        return camelCase.replaceFirst(substring, substring.toUpperCase());
    }

    default List constructorSql(List<String> list, String str) {
        if (list == null) {
            list = new ArrayList<>();
        }
        final int i = list.size();
        if (i > 0) {
            if (list.get(i - 1).length() >= 70) {
                list.add(str);
            } else {
                String s = list.get(i - 1);
                final String s1 = s + str;
                if (s1.length() >= 70) {
                    list.add(str);
                } else {
                    list.set(i - 1, s1);
                }
            }
        } else if (i == 0) {
            list.add(str);
        }
        return list;
    }

    default List getList(List<String> sqlCol, List insert_into) {
        for (int i = 0; i < sqlCol.size(); i++) {
            String s = sqlCol.get(i);
            if (i == sqlCol.size() - 1) {
                insert_into = constructorSql(insert_into, s);
            } else {
                insert_into = constructorSql(insert_into, s + ",");
            }
        }
        return insert_into;
    }

    default void switchType(Set<String> strings, String type) {
        switch (type) {
            case "Date":
                strings.add("import java.util.Date;");
                break;
            case "BigDecimal":
                strings.add("import java.math.BigDecimal;");
                break;
        }
    }

    default List<Table> tabelBuild(String driver, String url, String username, String password, DataCovert dataCovert) throws Exception {
        url = url + "?useUnicode=true&amp;characterEncoding=UTF-8&useInformationSchema=true";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        // 获取数据库信息
        DatabaseMetaData metaData = con.getMetaData();
        Statement statement = con.createStatement();
        ResultSet rs = metaData.getTables(null, null, null, new String[]{"TABLE"});
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
//                if (StringUtils.startsWith(tableName, REL)) {
////                    continue;
////                }
                tab = new Table();
                Set<String> strings = new HashSet<>();
                String abbreviation = getAbbreviation(tableName);
                tab.setTableName(toClassCase(tableName));
                tab.setTableOgrName(tableName);
                String tableServiceName=tableName;
                String tableName1 = tab.getTableName();
                if(tableName1.startsWith("Biz")){
                    tableServiceName= tableName1.substring(3);
                }else if(tableName1.startsWith("Basic")){
                    tableServiceName= tableName1.substring(5);
                }
                tab.setTableServiceName(tableServiceName);
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
                    if ("ENUM".equals(columnType)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("SELECT COLUMN_TYPE FROM information_schema.columns WHERE table_schema = '")
                            .append(colRet.getString(1))
                            .append("' AND table_name = '")
                            .append(tableName)
                            .append("' AND COLUMN_NAME= '")
                            .append(columnName)
                            .append("'");
                        ResultSet resultSet = statement.executeQuery(stringBuilder.toString());
                        resultSet.next();
                        String string = resultSet.getString(1);
                        String[] split = StringUtils.split(string, "'");
                        if (split != null && split.length > 0) {
                            List<EnumAttribute> enumAttributes = tab.getEnumAttributes();
                            EnumAttribute enumAttribute = new EnumAttribute();
                            enumAttribute.setEnumName(toCamelCase(columnName) + "Enum");
                            enumAttribute.setEnumRemark(remarks);
                            List<String> collect = Arrays.stream(split).filter(a -> (!"enum(".equals(a)) && (!",".equals(a)) && (!")".equals(a)))
                                .collect(Collectors.toList());
                            enumAttribute.setEnumValues(collect);
                            enumAttributes.add(enumAttribute);
                        }
                    }
                    col.setRemark(remarks);
                    col.setColumnName(columnName);
                    String camelCase = toCamelCase(columnName);
                    if (!"id".equals(columnName)) {
                        sqlCol.add(columnName);
                        enCol.add(" :" + camelCase);
                    }
                    col.setName(camelCase);
                    String type = dataCovert.covert(columnType);
                    try {
                        if(StringUtils.isNoneBlank(type)){
                            switchType(strings, type);
                        }
                    }catch (Exception e){
                        System.out.println(strings+"cat convert ");
                    }
                    col.setType(type);
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
                List delete = constructorSql(null, "DELETE  FROM " + tableName + " WHERE id= :id ");
                tab.setDeleteSql(delete);
                List delete1 = constructorSql(null, "UPDATE " + tableName + "SET operate_time = :operateTime, operator = :operator, delete_flag = :deleteFlag  WHERE id= :id ");
                tab.setDeleteFalseSql(delete1);
                tab.setColumns(columnList);
                List detals = constructorSql(null, "SELECT " + abbreviation + ".id,");
                List<String> collect1 = sqlCol.stream().map(a -> abbreviation + "." + a).collect(Collectors.toList());
                detals = getList(collect1, detals);
                detals = constructorSql(detals, " FROM " + tableName);
                List<String> page = new ArrayList<String>(detals);
                detals = constructorSql(detals, " " + abbreviation + " WHERE " + abbreviation + ".id= :id");
                page = constructorSql(page, " " + abbreviation + " WHERE " + abbreviation + ".delete_flag= :deleteFlag");
                tab.setDetailSql(detals);
                tab.setPageSql(page);

            }
            tables.add(tab);
        }

        return tables;
    }

    default String getAbbreviation(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = StringUtils.split(s, "_");
        if (split != null) {
            Arrays.stream(split).forEach(a -> sb.append(a.subSequence(0, 1)));
        }
        return sb.toString();
    }

    List<Table> getTables() throws Exception;

}
