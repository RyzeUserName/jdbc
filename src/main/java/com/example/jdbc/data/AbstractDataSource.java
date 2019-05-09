package com.example.jdbc.data;

import com.example.jdbc.data.filter.FilterManager;
import com.example.jdbc.data.jdbc.MyConnection;
import com.example.jdbc.data.jdbc.data.Table;
import com.example.jdbc.template.Template;

import java.util.List;

/**
 * 抽象= 实现
 * @author Ryze
 * @date 2018/6/22 15:35
 */
public abstract class AbstractDataSource<T> implements DataSource {
    protected List<Table> tables;

    protected AbstractDataSource(MyConnection jdbcConnection) throws Exception {
        this.tables = jdbcConnection.getTables();
    }

    protected AbstractDataSource(MyConnection jdbcConnection, FilterManager filterManager) throws Exception {
        List<Table> tables = jdbcConnection.getTables();
        List<Table> filter = (List<Table>) filterManager.filter(tables);
        this.tables = filter;
    }

    /**
     * 获取数据
     */
    @Override
    public List<Table> getSource() {
        return tables;
    }

    /**
     * 获取数据
     * @param source
     */
    @Override
    public void setSource(Object source) {
        this.tables = (List<Table>) source;
    }

    /**
     * load 模板和过滤
     */
    @Override
    public void load(Template template) {
        template.execute(tables);
    }

}
