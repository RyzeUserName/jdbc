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
public class VueTemplateForBeanDao implements Template<DataSource> {
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
            cfg.setDirectoryForTemplateLoading(new File(VueTemplateForBeanDao.class.getResource("/").getPath()));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            freemarker.template.Template temp = cfg.getTemplate("vueController.ftl");
            freemarker.template.Template temp2 = cfg.getTemplate("vueJs.ftl");
            freemarker.template.Template temp3 = cfg.getTemplate("vueJsp.ftl");
            freemarker.template.Template temp4 = cfg.getTemplate("vueService.ftl");
            freemarker.template.Template temp5 = cfg.getTemplate("vuebean.ftl");
            freemarker.template.Template temp6 = cfg.getTemplate("vueMapper.ftl");
            freemarker.template.Template temp7 = cfg.getTemplate("vueDao.ftl");
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
                    // 组装数据
                    root.put(PACKAGE_NAME, CLASS_PACKAGE_NAME);
                    root.put(AUTHOR, author);
                    root.put("version", version);
                    root.put("tableName", table.getTableName());
                    String tableOgrName = table.getTableOgrName();
                    root.put("tableOgrName", tableOgrName);
                    root.put("className", table.getTableName());
                    root.put("classRemark", table.getTableRemarks());
                    root.put("attrs", table.getColumns());
                    root.put(DATE, dateFormat.format(new Date()));
                    root.put("addSql", table.getAddSql());
                    root.put("pageSql", table.getPageSql());
                    root.put("updateSql", table.getUpdateSql());
                    root.put("detailSql", table.getDetailSql());
                    root.put("deleteSql", table.getDeleteSql());
                    root.put("deleteFalseSql", table.getDeleteFalseSql());
                    root.put("importType", table.getImportType());
                    File dir = new File(LOCATION);
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    File file = new File(LOCATION + "/" + tableOgrName);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    //生成controller
                    Conservice(temp, table.getTableName() + "Controller.java", root, file);
                    //生成js
                    Conservice(temp2, table.getTableName() + ".js", root, file);
                    //生成jsp
                    Conservice(temp3, table.getTableName() + ".jsp", root, file);
                    //生成service
                    Conservice(temp4, table.getTableName() + "Service.java", root, file);
                    //生成bean
                    Conservice(temp5, table.getTableName() + ".java", root, file);
                    //生成mapper
                    Conservice(temp6, table.getTableName() + "Mapper.xml", root, file);
                    //生成DAO
                    Conservice(temp7, table.getTableName() + "DAO.java", root, file);

                })
            );
            System.out.println("代码生成成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Conservice(freemarker.template.Template temp4, String name, Map<String, Object> root, File dir) {
        try (OutputStream fos = new FileOutputStream(new File(dir, name))) {
            Writer out = new OutputStreamWriter(fos);
            temp4.process(root, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public VueTemplateForBeanDao(String author, String version) {
        this.author = author;
        this.version = version;
    }

    public static VueTemplateForBeanDao build(String author, String version) {
        return new VueTemplateForBeanDao(author, version);
    }
}
