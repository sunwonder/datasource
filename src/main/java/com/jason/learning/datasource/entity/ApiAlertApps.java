package com.jason.learning.datasource.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "api_alert_apps")
public class ApiAlertApps implements Serializable {
    @Id
    private Long id;

    /**
     * 预警ID
     */
    @Column(name = "alert_id")
    private Long alertId;

    /**
     * 调用方标识
     */
    @Column(name = "app_id")
    private String appId;

    /**
     * 钉钉机器人access_token
     */
    private String token;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 使用状态 默认0开放，1锁定
     */
    private Short status;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取预警ID
     *
     * @return alert_id - 预警ID
     */
    public Long getAlertId() {
        return alertId;
    }

    /**
     * 设置预警ID
     *
     * @param alertId 预警ID
     */
    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    /**
     * 获取调用方标识
     *
     * @return app_id - 调用方标识
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置调用方标识
     *
     * @param appId 调用方标识
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 获取钉钉机器人access_token
     *
     * @return token - 钉钉机器人access_token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置钉钉机器人access_token
     *
     * @param token 钉钉机器人access_token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取使用状态 默认0开放，1锁定
     *
     * @return status - 使用状态 默认0开放，1锁定
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置使用状态 默认0开放，1锁定
     *
     * @param status 使用状态 默认0开放，1锁定
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}