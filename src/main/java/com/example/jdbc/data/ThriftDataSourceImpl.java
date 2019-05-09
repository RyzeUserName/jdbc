package com.example.jdbc.data;

import com.example.jdbc.data.filter.FilterManager;
import com.example.jdbc.data.filter.TableNameFilter;
import com.example.jdbc.data.jdbc.MyConnection;
import com.example.jdbc.data.jdbc.ThriftConnection;

import java.util.List;

/**
 * 描述
 * @author Ryze
 * @date 2018/6/27 19:40
 */
public class ThriftDataSourceImpl extends AbstractDataSource {

    public ThriftDataSourceImpl(MyConnection jdbcConnection) throws Exception {
        super(jdbcConnection);
    }

    public ThriftDataSourceImpl(MyConnection jdbcConnection, FilterManager filterManager) throws Exception {
        super(jdbcConnection, filterManager);
    }

    public static ThriftDataSourceImpl build(String driver, String url, String username, String password) throws Exception {
        return new ThriftDataSourceImpl(ThriftConnection.buildJdbcConnection(driver,
            url,
            username,
            password));
    }

    public static ThriftDataSourceImpl build(String driver, String url, String username, String password, FilterManager filterManager) throws Exception {
        return new ThriftDataSourceImpl(ThriftConnection.buildJdbcConnection(driver,
            url,
            username,
            password), filterManager);
    }

    public static ThriftDataSourceImpl buildIn(String driver, String url, String username, String password, List<String> list) throws Exception {
        return getDataSource(driver, url, username, password, list, TableNameFilter.InOrOutEnum.IN);
    }

    public static ThriftDataSourceImpl buildOut(String driver, String url, String username, String password, List<String> list) throws Exception {
        return getDataSource(driver, url, username, password, list, TableNameFilter.InOrOutEnum.OUT);
    }

    private static ThriftDataSourceImpl getDataSource(String driver, String url, String username, String password, List<String> list, TableNameFilter.InOrOutEnum out) throws Exception {
        FilterManager filterManager = new FilterManager();
        TableNameFilter tableNameFilter = new TableNameFilter();
        tableNameFilter.setList(list, out);
        filterManager.addFilter(tableNameFilter);
        return new ThriftDataSourceImpl(ThriftConnection.buildJdbcConnection(driver,
            url,
            username,
            password), filterManager);
    }
}
