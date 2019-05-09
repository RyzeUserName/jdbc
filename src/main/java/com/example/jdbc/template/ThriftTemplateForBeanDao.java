package com.example.jdbc.template;

import com.example.jdbc.data.DataSource;
import com.example.jdbc.data.jdbc.data.Table;
import com.google.common.collect.Maps;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Freemarker 模板
 * @author Ryze
 * @date 2018/6/22 18:29
 */
public class ThriftTemplateForBeanDao implements Template<DataSource> {
    private String author;
    private String version;

    /**
     * load
     */
    @Override
    public void execute(DataSource object) {
        try {
            List<Table> tables = (List<Table>) object.getSource();
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
            cfg.setDirectoryForTemplateLoading(new File(ThriftTemplateForBeanDao.class.getResource("/").getPath()));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            freemarker.template.Template temp = cfg.getTemplate("dao.ftl");
            freemarker.template.Template temp3 = cfg.getTemplate("thrift.ftl");
            HashMap<String, Object> params = Maps.newHashMap();
            params.put("tables", tables);
            params.put(PACKAGE_NAME, CLASS_PACKAGE_NAME);
            params.put(AUTHOR, author);
            params.put("version", version);
            final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            params.put(DATE, dateFormat.format(new Date()));
            Optional.ofNullable(tables).ifPresent(a ->
                a.stream().forEach(table -> {
                    Map<String, Object> root = Maps.newHashMap();
                    //为Dao 组装数据
                    root.put(PACKAGE_NAME, CLASS_PACKAGE_NAME);
                    root.put(AUTHOR, author);
                    root.put("version", version);
                    root.put("className", table.getTableName());
                    root.put("classRemark", table.getTableRemarks());
                    root.put("attrs", table.getColumns());
                    root.put(DATE, dateFormat.format(new Date()));
                    root.put("addSql", table.getAddSql());
                    root.put("updateSql", table.getUpdateSql());
                    root.put("detailSql", table.getDetailSql());
                    root.put("deleteSql", table.getDeleteSql());
                    root.put("importType", table.getImportType());
                    File dir = new File(LOCATION);
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    //生成Dao
                    try (OutputStream fos = new FileOutputStream(new File(dir, table.getTableName() + "Dao.java"))) {
                        Writer out = new OutputStreamWriter(fos);
                        temp.process(root, out);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (TemplateException e) {
                        e.printStackTrace();
                    }
                    //生成 Thirft
                    try (OutputStream fos3 = new FileOutputStream(new File(LOCATION, table.getTableName() + "Service.thrift"))) {
                        Writer out3 = new OutputStreamWriter(fos3);
                        temp3.process(params, out3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                })
            );
            System.out.println("代码生成成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ThriftTemplateForBeanDao(String author, String version) {
        this.author = author;
        this.version = version;
    }

    public static ThriftTemplateForBeanDao build(String author, String version) {
        return new ThriftTemplateForBeanDao(author, version);
    }
}
