package com.example.txt;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 描述
 * @author Ryze
 * @date 2018/11/28 13:27
 */
public class Txt {
    static String txt = "public class User {" +
        "    private Long id;" +
        "    private String name;" +
        "    private Integer age;" +
        "" +
        "    public Long getId() {" +
        "        return id;" +
        "    }" +
        "" +
        "    public void setId(Long id) {" +
        "        this.id = id;" +
        "    }" +
        "" +
        "    public String getName() {" +
        "        return name;" +
        "    }" +
        "" +
        "    public void setName(String name) {" +
        "        this.name = name;" +
        "    }" +
        "" +
        "    public Integer getAge() {" +
        "        return age;" +
        "    }" +
        "" +
        "    public void setAge(Integer age) {" +
        "        this.age = age;" +
        "    }" +
        "}";

    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();
        dataStructure.templetContext = "public class ${} \\}$ ";
        dataStructure.addData = new AddData("类添加内容");

        DataStructure dataStructure1 = new DataStructure();
        dataStructure1.templetContext = "private  ${};";
        dataStructure1.addData = new AddData("字段添加内容");

        DataStructure dataStructure2 = new DataStructure();
        dataStructure2.templetContext = " public void set${}this.${} = ${};}";
        dataStructure2.addData = new AddData("set方法添加内容");

        DataStructure dataStructure3 = new DataStructure();
        dataStructure3.templetContext = "public ${} get${}return ${};}";
        dataStructure3.addData = new AddData("get方法添加内容");

        List<DataStructure> dataStructures = new ArrayList<>();
        dataStructures.add(dataStructure3);
        dataStructures.add(dataStructure2);
        dataStructures.add(dataStructure1);
        dataStructures.add(dataStructure);

        //数据校验
        dataStructures.stream().forEach(a -> a.dataSpace());

        String s = txt.replaceAll("\\s*|\t|\r|\n", "");
        dataStructures.stream().forEach(a -> {
            int i=0;
            String templetContext = a.templetContext;
            Pattern pattern = Pattern.compile(templetContext);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()){
                System.out.println(matcher.group());
                ++i;
            }
            System.out.println(i);
        });
        //System.out.println(s);
    }
}
