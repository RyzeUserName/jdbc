package com.example.txt;

import java.util.Date;

public class User {
    private String name;
    private Integer age;
    private Date brthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBrthday() {
        return brthday;
    }

    public void setBrthday(Date brthday) {
        this.brthday = brthday;
    }
}
