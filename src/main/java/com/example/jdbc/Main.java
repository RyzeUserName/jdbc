package com.example.jdbc;

import com.example.jdbc.data.JdbcDataSourceImpl;
import com.example.jdbc.data.ThriftDataSourceImpl;
import com.example.jdbc.data.filter.FilterManager;
import com.example.jdbc.data.filter.TableNameFilter;
import com.example.jdbc.template.FreeTemplateForBeanDao;
import com.example.jdbc.template.ThriftTemplateForBeanDao;

import java.util.List;

/**
 * 入口
 * data 数据库
 * generate 生成代码
 * template 模板引擎
 * @author Ryze
 * @date 2018/6/22 10:09
 */
public class Main {
    public static void main(String[] args) throws Exception {
       //a(); //普通的全生成
       //b(); //加过滤器的
        //c(); //简单过滤器
        //d();//简单过滤器
        //aa(); //thrift普通的全生成
        //bb(); //thrift 加过滤器的
        //dd(); //thrift 简单过滤器
       // e();//普通的全生成
        f();//2.0生成
        //g();//vue
       // h();
        //i();
    }
    public static void a() throws Exception {
        new Generate().withDataSource(JdbcDataSourceImpl.build(
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.12:3306/agora_marketing_platform",
            "project_manage_platform",
            "project_manage_platform_123456"))
            .withTemplate(FreeTemplateForBeanDao.build("Ryze", "V 1.0.0")).build();
    }
    public static void aa() throws Exception {
        new Generate().withDataSource(ThriftDataSourceImpl.build(
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.12:3306/agora_marketing_platform",
            "project_manage_platform",
            "project_manage_platform_123456"))
            .withTemplate(ThriftTemplateForBeanDao.build("Ryze", "V 1.0.0")).build();
    }
    public static void b() throws Exception {
        FilterManager filterManager = new FilterManager();

        TableNameFilter tableNameFilter = new TableNameFilter();
        tableNameFilter.setList(List.of("BizServe","BizServeItem"),TableNameFilter.InOrOutEnum.IN);

        TableNameFilter tableNameFilter1 = new TableNameFilter();
        tableNameFilter1.setList(List.of("BizServe"),TableNameFilter.InOrOutEnum.OUT);

        filterManager.addFilter(tableNameFilter);
        filterManager.addFilter(tableNameFilter1);
        new Generate().withDataSource(JdbcDataSourceImpl.build(
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.12:3306/agora_marketing_platform",
            "project_manage_platform",
            "project_manage_platform_123456",filterManager))
            .withTemplate(FreeTemplateForBeanDao.build("Ryze", "V 1.0.0")).build();
    }
    public static void bb() throws Exception {
        FilterManager filterManager = new FilterManager();

        TableNameFilter tableNameFilter = new TableNameFilter();
        tableNameFilter.setList(List.of("BizServe","BizServeItem"),TableNameFilter.InOrOutEnum.IN);

        TableNameFilter tableNameFilter1 = new TableNameFilter();
        tableNameFilter1.setList(List.of("BizServe"),TableNameFilter.InOrOutEnum.OUT);

        filterManager.addFilter(tableNameFilter);
        filterManager.addFilter(tableNameFilter1);
        new Generate().withDataSource(ThriftDataSourceImpl.build(
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.12:3306/agora_marketing_platform",
            "project_manage_platform",
            "project_manage_platform_123456",filterManager))
            .withTemplate(ThriftTemplateForBeanDao.build("Ryze", "V 1.0.0")).build();
    }

    public static void c() throws Exception {
        //只有这些
        new Generate().withDataSource(JdbcDataSourceImpl.buildIn(
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.12:3306/agora_marketing_platform",
            "project_manage_platform",
            "project_manage_platform_123456",List.of("BizServe")))
            .withTemplate(FreeTemplateForBeanDao.build("Ryze", "V 1.0.0")).build();
    }
    public static void d() throws Exception {
        //去除这些
        new Generate().withDataSource(JdbcDataSourceImpl.buildOut(
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.12:3306/agora_marketing_platform",
            "project_manage_platform",
            "project_manage_platform_123456",List.of("BizServe")))
            .withTemplate(FreeTemplateForBeanDao.build("Ryze", "V 1.0.0")).build();
    }
    public static void dd() throws Exception {
        //去除这些
        new Generate().withDataSource(ThriftDataSourceImpl.buildOut(
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.12:3306/agora_marketing_platform",
            "project_manage_platform",
            "project_manage_platform_123456",List.of("BizServe")))
            .withTemplate(ThriftTemplateForBeanDao.build("Ryze", "V 1.0.0")).build();
    }
    public static void e() throws Exception {
        GenerateMaker.generate(GenerateMaker.Type.NORMAL,
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.92:3306/usermanager_platform",
            "dev_app",
            "dev123456",
            "Ryze", "V 2.0.0");
    }
    public static void f() throws Exception {
        GenerateMaker.generate(GenerateMaker.Type.NORMAL,
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.92:3306/walletpayment_ser",
            "dev",
            "dev_zht",
            "Ryze", "V 2.0.0");
    }
    public static void g() throws Exception {
        GenerateMaker.generate(GenerateMaker.Type.Vue,
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.92:3306/basicdata_ser",
            "dev_app",
            "dev123456",
            "Ryze", "V 2.0.0");
    }
    public static void h() throws Exception {
        GenerateMaker.generate(GenerateMaker.Type.NORMAL,
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.92:3306/conference_system",
            "dev_app",
            "dev123456",
            " ", "V 1.0.0");
    }
    public static void i() throws Exception {
        GenerateMaker.generate(GenerateMaker.Type.ALL,
            "com.mysql.jdbc.Driver",
            "jdbc:mysql://192.168.0.92:3306/conference_system",
            "dev_app",
            "dev123456",
            " ", "V 1.0.0");
    }
}
