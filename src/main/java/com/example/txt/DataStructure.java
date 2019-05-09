package com.example.txt;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 描述
 * @author Ryze
 * @date 2018/11/28 13:30
 */
public class DataStructure {
    AddData addData;
    String templetContext;

    public void dataSpace() {
        String s = templetContext.replaceAll("\\s*|\t|\r|\n", "");
        String[] split = StringUtils.split(s, "|");
        templetContext = Arrays.stream(split).filter(a -> a != null).collect(Collectors.joining());
        templetContext = templetContext.replaceAll("\\$\\{\\}", "[a-zA-Z,;,(,),{,},0-9]*");
        templetContext= templetContext.replace("\\", "\\\\")
                        //.replace("+", "\\+").replace("|", "\\|")
                        .replace("{", "\\{").replace("}", "\\}")
                        .replace("(", "\\(").replace(")", "\\)")
                        //.replace("^", "\\^").replace("$", "\\$")
                        //.replace("[", "\\[").replace("]", "\\]")
                        //.replace("?", "\\?").replace(",", "\\,")
                        .replace(".", "\\.").replace("&", "\\&");
    }
}
