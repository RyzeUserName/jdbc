package com.example.jdbc.data;

import com.example.jdbc.template.Template;

/**
 * 数据来源
 * @author Ryze
 * @date 2018-06-22 14:06:33
 * @version V1.0.0
 */
public interface DataSource<T> {
    /**
     * 获取数据
     */
    Object getSource();
    /**
     * 获取数据
     */
    void setSource(Object source);
    /**
     * load
     */
    void load(Template template);
}
