package com.example.txt;

import java.io.*;

public class Tst {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File file = new File("F:\\study\\jdbc\\src\\main\\java\\com\\example\\txt\\User.java");
        InputStream inputStream = new FileInputStream(file);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = null;
            boolean isClass = true;
            while ((line = bufferedReader.readLine()) != null) {
                //过滤包
                if (line.contains("package")) {
                    sb.append(line);
                    sb.append("\n");
                    continue;
                }
                //第一个public 为类
                if (line.contains("public") && isClass) {
                    sb.append(line);
                    sb.append("\n");
                    isClass = false;
                    continue;
                }
                //字段
                if (line.contains("private")) {
                    sb.append("// 字段添加");
                    sb.append("\n");
                    sb.append(line);
                    sb.append("\n");
                    continue;
                }
                //get
                if (line.contains("get")) {
                    sb.append("// get添加");
                    sb.append("\n");
                    sb.append(line);
                    sb.append("\n");
                    continue;
                }
                //set
                if (line.contains("set")) {
                    sb.append("// set添加");
                    sb.append("\n");
                    sb.append(line);
                    sb.append("\n");
                    continue;
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
