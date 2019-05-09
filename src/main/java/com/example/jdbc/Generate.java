package com.example.jdbc;

import com.example.jdbc.data.DataSource;
import com.example.jdbc.template.Template;

/**
 * 生成类
 * @author Ryze
 * @date 2018/6/22 12:56
 */
public class Generate {
    private DataSource dataSource;
    private Template template;

    /**
     * 构造
     */
    public Generate() {
    }

    public Generate(DataSource dataSource, Template template) {
        this.dataSource = dataSource;
        this.template = template;
    }

    /**
     * build 方法
     */
    public void build() {
        template.execute(dataSource);
    }

    /**
     * with 组装数据
     */
    public Generate withDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Generate withTemplate(Template template) {
        this.template = template;
        return this;
    }

    /**
     * get/set
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

}
