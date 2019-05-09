package com.example.jdbc.data.jdbc;

import com.example.jdbc.data.covert.DataCovert;
import com.example.jdbc.data.covert.JdbcDataCovert;
import com.example.jdbc.data.jdbc.data.Table;

import java.util.List;

/**
 * 连接
 * @author Ryze
 * @date 2018/6/22 17:27
 */
public class JdbcMyConnection implements MyConnection {
    private String driver = "com.mysql.jdbc.Driver";
    private String url;
    private String username;
    private String password;
    private DataCovert dataCovert;

    public static JdbcMyConnection buildJdbcConnection(String driver, String url, String username, String password) {
        return new JdbcMyConnection(driver, url, username, password);
    }

    public JdbcMyConnection(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.dataCovert = new JdbcDataCovert();
    }

    public JdbcMyConnection(String driver, String url, String username, String password, DataCovert dataCovert) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.dataCovert = dataCovert;
    }

    @Override
    public List<Table> getTables() throws Exception {
        return tabelBuild(driver, url, username, password, dataCovert);
    }


}
