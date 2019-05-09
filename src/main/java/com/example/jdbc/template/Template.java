package com.example.jdbc.template;

import com.example.jdbc.Generate;

import java.io.File;

/**
 * 模板引擎
 * @author Ryze
 * @date 2018-06-22 13:55:25
 * @version V1.0.0
 */
public interface Template<T> {
    String AUTHOR = "author";
    String PACKAGE_NAME = "packageName";
    String DATE = "date";
    /**
     * 生成类的包名
     */
    String CLASS_PACKAGE_NAME = Generate.class.getPackageName() + ".generate";
    /**
     *  生成目录
     */
    String LOCATION = new File("").getAbsolutePath() + "/src/main/java/" + CLASS_PACKAGE_NAME.replaceAll("\\.", "/");

    /**
     * load
     */
    void execute(T object);

}
