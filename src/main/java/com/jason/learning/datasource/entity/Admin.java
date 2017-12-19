package com.jason.learning.datasource.entity;

import javax.persistence.Table;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2017-12-14 下午11:23
 **/
@Table(name = "T_ADMIN")
public class Admin {
    private int id;
    private String name;
    private String password;
    private String phone;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
