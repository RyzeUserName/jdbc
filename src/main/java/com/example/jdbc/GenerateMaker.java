package com.example.jdbc;

import com.example.jdbc.data.JdbcDataSourceImpl;
import com.example.jdbc.data.ThriftDataSourceImpl;
import com.example.jdbc.data.Thrift2DataSourceImpl;
import com.example.jdbc.template.*;

import java.util.List;

/**
 * 外观模式
 * @author Ryze
 * @date 2018/6/27 20:34
 */
public class GenerateMaker {

    public static void generate(Type type, String driver, String url, String username, String password, String author, String version) throws Exception {
        switch (type) {
            case NORMAL:
                new Generate().withDataSource(JdbcDataSourceImpl.build(
                    driver,
                    url,
                    username,
                    password))
                    .withTemplate(FreeTemplateForBeanDao.build(author, version)).build();
                break;
            case Thrift:
                new Generate().withDataSource(ThriftDataSourceImpl.build(
                    driver,
                    url,
                    username,
                    password))
                    .withTemplate(ThriftTemplateForBeanDao.build(author, version)).build();
                break;
            case Thrift2:
                new Generate().withDataSource(Thrift2DataSourceImpl.build(
                    driver,
                    url,
                    username,
                    password))
                    .withTemplate(Thrift2TemplateForBeanDao.build(author, version)).build();
                break;
            case Vue:
                new Generate().withDataSource(JdbcDataSourceImpl.build(
                    driver,
                    url,
                    username,
                    password))
                    .withTemplate(VueTemplateForBeanDao.build(author, version)).build();
            case ALL:
                new Generate().withDataSource(JdbcDataSourceImpl.build(
                    driver,
                    url,
                    username,
                    password))
                    .withTemplate(NormalForBeanDao.build(author, version)).build();
                break;
        }
    }

    public static void generateIn(Type type, List<String> in, String driver, String url, String username, String password, String author, String version) throws Exception {
        switch (type) {
            case NORMAL:
                new Generate().withDataSource(JdbcDataSourceImpl.buildIn(
                    driver,
                    url,
                    username,
                    password, in))
                    .withTemplate(FreeTemplateForBeanDao.build(author, version)).build();
                break;
            case Thrift:
                new Generate().withDataSource(ThriftDataSourceImpl.buildIn(
                    driver,
                    url,
                    username,
                    password, in))
                    .withTemplate(ThriftTemplateForBeanDao.build(author, version)).build();
                break;
            case Thrift2:
                new Generate().withDataSource(Thrift2DataSourceImpl.buildIn(
                    driver,
                    url,
                    username,
                    password, in))
                    .withTemplate(Thrift2TemplateForBeanDao.build(author, version)).build();
                break;
        }
    }

    public static void generateOut(Type type, List<String> out, String driver, String url, String username, String password, String author, String version) throws Exception {
        switch (type) {
            case NORMAL:
                new Generate().withDataSource(JdbcDataSourceImpl.buildOut(
                    driver,
                    url,
                    username,
                    password, out))
                    .withTemplate(FreeTemplateForBeanDao.build(author, version)).build();
                break;
            case Thrift:
                new Generate().withDataSource(ThriftDataSourceImpl.buildOut(
                    driver,
                    url,
                    username,
                    password, out))
                    .withTemplate(ThriftTemplateForBeanDao.build(author, version)).build();
                break;
            case Thrift2:
                new Generate().withDataSource(Thrift2DataSourceImpl.buildOut(
                    driver,
                    url,
                    username,
                    password, out))
                    .withTemplate(Thrift2TemplateForBeanDao.build(author, version)).build();
                break;

        }
    }

    public enum Type {
        Thrift("微服务"), NORMAL("平常的"), Thrift2("微服务2"), Vue("vue"), ALL("全套");
        private String label;

        Type(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
