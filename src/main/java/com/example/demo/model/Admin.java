package com.example.demo.model;

public class Admin extends BaseMoedel{
    private static final long serialVersionUID = -5172942130679353613L;

    private String name;

    private String password;

    //管理员权限等级——备用参数
    private int level;

    //是否可用
    private Boolean deleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
