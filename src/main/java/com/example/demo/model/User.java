package com.example.demo.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -609314963925055048L;

    //用户id
    private int id;

    //用户名
    private String name;

    //性别
    private String sex;

    //年龄
    private int age;

    //备注
    private String comment;

    //是否删除
    private Boolean deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", comment='" + comment + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
