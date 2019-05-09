package com.example.jdbc.data;

import com.example.jdbc.data.filter.FilterManager;
import com.example.jdbc.data.filter.TableNameFilter;
import com.example.jdbc.data.jdbc.JdbcMyConnection;
import com.example.jdbc.data.jdbc.MyConnection;

import java.util.List;

/**
 * jdbc 实现
 * @author Ryze
 * @date 2018/6/22 15:35
 */
public class JdbcDataSourceImpl extends AbstractDataSource {
    public JdbcDataSourceImpl(MyConnection jdbcConnection) throws Exception {
        super(jdbcConnection);
    }

    public JdbcDataSourceImpl(MyConnection jdbcConnection, FilterManager filterManager) throws Exception {
        super(jdbcConnection, filterManager);
    }
    public static JdbcDataSourceImpl build(String driver, String url, String username, String password) throws Exception {
        return new JdbcDataSourceImpl(JdbcMyConnection.buildJdbcConnection(driver,
            url,
            username,
            password));
    }

    public static JdbcDataSourceImpl build(String driver, String url, String username, String password, FilterManager filterManager) throws Exception {
        return new JdbcDataSourceImpl(JdbcMyConnection.buildJdbcConnection(driver,
            url,
            username,
            password), filterManager);
    }

    public static JdbcDataSourceImpl buildIn(String driver, String url, String username, String password, List<String> list) throws Exception {
        return getJdbcDataSource(driver, url, username, password, list, TableNameFilter.InOrOutEnum.IN);
    }

    public static JdbcDataSourceImpl buildOut(String driver, String url, String username, String password, List<String> list) throws Exception {
        return getJdbcDataSource(driver, url, username, password, list, TableNameFilter.InOrOutEnum.OUT);
    }

    private static JdbcDataSourceImpl getJdbcDataSource(String driver, String url, String username, String password, List<String> list, TableNameFilter.InOrOutEnum out) throws Exception {
        FilterManager filterManager = new FilterManager();
        TableNameFilter tableNameFilter = new TableNameFilter();
        tableNameFilter.setList(list, out);
        filterManager.addFilter(tableNameFilter);
        return new JdbcDataSourceImpl(JdbcMyConnection.buildJdbcConnection(driver,
            url,
            username,
            password), filterManager);
    }
}
