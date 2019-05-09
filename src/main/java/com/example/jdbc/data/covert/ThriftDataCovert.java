package com.example.jdbc.data.covert;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * thrift 实现
 * @author Ryze
 * @date 2018/6/22 16:02
 */
public class ThriftDataCovert implements DataCovert {
    private static final String INT = "int";
    private static final String BIG_INT = "INT";
    private static final String LONG = "long";
    private static final String DATE = "Date";
    private static final String STRING = "String";
    private static final String DOUBLE = "double";
    private Map<String, String> map;

    /**
     * 转换
     * @param from
     * @return java.lang.String
     * @author Ryze
     * @date 2018-06-22 15:37:03
     */
    @Override
    public String covert(String from) {
        return map.get(from);
    }

    /**
     * 添加
     * @param name
     * @param value
     */
    @Override
    public void add(String name, String value) {
        map.put(name, value);
    }

    public ThriftDataCovert() {
        Map<String, String> map = Maps.newHashMap();
        //mysql类型到java类型的转换
        map.put("VARCHAR", STRING);
        map.put(BIG_INT, INT);
        map.put("INT UNSIGNED", INT);
        map.put("BIGINT", LONG);
        map.put("BIGINT UNSIGNED", LONG);
        map.put("DOUBLE", DOUBLE);
        map.put("DOUBLE UNSIGNED", DOUBLE);
        map.put("FLOAT", DOUBLE);
        map.put("FLOAT UNSIGNED", DOUBLE);
        map.put("TIME", DATE);
        map.put("DATETIME", DATE);
        map.put("TIMESTAMP", LONG);
        map.put("TINYINT", INT);
        map.put("TINYINT UNSIGNED", INT);
        map.put("BOOLEAN", "boolean");
        map.put("ENUM", "String");
        map.put("BIT", INT);
        map.put("DECIMAL", "String");
        map.put("LONG", INT);
        map.put("MEDIUMTEXT", "String");
        //java类型到thrift
        map.put(STRING + "thrift", "string");
        map.put(INT + "thrift", "i32");
        map.put(LONG + "thrift", "i64");
        map.put(DOUBLE + "thrift", DOUBLE);
        map.put("boolean" + "thrift", "bool");
        map.put("Date" + "thrift", "i64");
        map.put("TEXT", "String");
        map.put("CHAR", "String");
        this.map = map;
    }
}
