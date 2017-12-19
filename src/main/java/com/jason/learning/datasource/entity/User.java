package com.jason.learning.datasource.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User implements Serializable {
    /**
     * 用户主键
     */
    @Id
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 用户手机号
     */
    @Column(name = "USER_MOBILE")
    private String userMobile;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户主键
     *
     * @return USER_ID - 用户主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户主键
     *
     * @param userId 用户主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return USER_NAME - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取用户密码
     *
     * @return PASSWORD - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取用户手机号
     *
     * @return USER_MOBILE - 用户手机号
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 设置用户手机号
     *
     * @param userMobile 用户手机号
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}