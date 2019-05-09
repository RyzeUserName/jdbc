package com.example.jdbc.data;

import com.example.jdbc.data.filter.FilterManager;
import com.example.jdbc.data.filter.TableNameFilter;
import com.example.jdbc.data.jdbc.MyConnection;
import com.example.jdbc.data.jdbc.Thrift2MyConnection;

import java.util.List;

/**
 * jdbc 实现
 * @author Ryze
 * @date 2018/6/22 15:35
 */
public class Thrift2DataSourceImpl extends AbstractDataSource {
    public Thrift2DataSourceImpl(MyConnection jdbcConnection) throws Exception {
        super(jdbcConnection);
    }

    public Thrift2DataSourceImpl(MyConnection jdbcConnection, FilterManager filterManager) throws Exception {
        super(jdbcConnection, filterManager);
    }
    public static Thrift2DataSourceImpl build(String driver, String url, String username, String password) throws Exception {
        return new Thrift2DataSourceImpl(Thrift2MyConnection.buildJdbcConnection(driver,
            url,
            username,
            password));
    }

    public static Thrift2DataSourceImpl build(String driver, String url, String username, String password, FilterManager filterManager) throws Exception {
        return new Thrift2DataSourceImpl(Thrift2MyConnection.buildJdbcConnection(driver,
            url,
            username,
            password), filterManager);
    }

    public static Thrift2DataSourceImpl buildIn(String driver, String url, String username, String password, List<String> list) throws Exception {
        return getJdbcDataSource(driver, url, username, password, list, TableNameFilter.InOrOutEnum.IN);
    }

    public static Thrift2DataSourceImpl buildOut(String driver, String url, String username, String password, List<String> list) throws Exception {
        return getJdbcDataSource(driver, url, username, password, list, TableNameFilter.InOrOutEnum.OUT);
    }

    private static Thrift2DataSourceImpl getJdbcDataSource(String driver, String url, String username, String password, List<String> list, TableNameFilter.InOrOutEnum out) throws Exception {
        FilterManager filterManager = new FilterManager();
        TableNameFilter tableNameFilter = new TableNameFilter();
        tableNameFilter.setList(list, out);
        filterManager.addFilter(tableNameFilter);
        return new Thrift2DataSourceImpl(Thrift2MyConnection.buildJdbcConnection(driver,
            url,
            username,
            password), filterManager);
    }
}
