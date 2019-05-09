package com.example.jdbc.data.covert;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * jdbc 实现
 * @author Ryze
 * @date 2018/6/22 16:02
 */
public class Thrift2DataCovert implements DataCovert {
    private static final String INT = "Long";
    private static final String LONG = "Long";
    private static final String DATE = "Long";
    private static final String STRING = "String";
    private static final String DOUBLE = "Double";
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

    public Thrift2DataCovert() {
        Map<String, String> map = Maps.newHashMap();
        map.put("VARCHAR", STRING);
        map.put("LONG", INT);
        map.put("INT", INT);
        map.put("INT UNSIGNED", INT);
        map.put("BIGINT", LONG);
        map.put("BIGINT UNSIGNED", LONG);
        map.put("DOUBLE", DOUBLE);
        map.put("DOUBLE UNSIGNED", DOUBLE);
        map.put("FLOAT", DOUBLE);
        map.put("FLOAT UNSIGNED", DOUBLE);
        map.put("TIME", DATE);
        map.put("DATETIME", DATE);
        map.put("DATE", DATE);
        map.put("TIMESTAMP", DATE);
        map.put("TINYINT", "Boolean");
        map.put("TINYINT UNSIGNED", INT);
        map.put("BOOLEAN", "Boolean");
        map.put("ENUM", "String");
        map.put("DECIMAL", "BigDecimal");
        map.put("BIT", "Integer");
        map.put("TEXT", "String");
        map.put("CHAR", "String");
        this.map = map;
    }
}
