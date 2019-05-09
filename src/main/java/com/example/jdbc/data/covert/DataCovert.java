package com.example.jdbc.data.covert;

/**
 * 数据转换
 * @author Ryze
 * @date 2018-06-22 15:24:28
 * @version V1.0.0
 */
public interface DataCovert {
    /**
     * 转换
     * @param from
     * @return java.lang.String
     * @author Ryze
     * @date 2018-06-22 15:37:03
     */
    String covert(String from);

    /**
     * 添加
     */
    void add(String name,String value);
}
