package com.example.demo.model;

import lombok.Data;
@Data
public class StudentljdContent {
    Integer id;
    String name;
    Integer age;
    String addr;
    String sex;
    String mark;

    public StudentljdContent(Integer id, String name, Integer age, String addr, String sex, String mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.sex = sex;
        this.mark = mark;
    }

    public StudentljdContent() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
