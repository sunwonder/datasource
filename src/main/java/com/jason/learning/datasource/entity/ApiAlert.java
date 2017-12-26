package com.jason.learning.datasource.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "api_alert")
public class ApiAlert implements Serializable {
    @Id
    private Long id;

    /**
     * 预警名称
     */
    @Column(name = "alert_name")
    private String alertName;

    /**
     * 通知人手机号码
     */
    private String mobile;

    /**
     * 通知人邮箱号码
     */
    private String email;

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

    /**
     * 单个接口失败率
     */
    @Column(name = "fail_rate")
    private Double failRate;

    /**
     * 单个接口失败次数
     */
    @Column(name = "fail_count")
    private Integer failCount;

    /**
     * 调用方配置
     */
    @Column(name = "app_ids")
    private String appIds;

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
     * 获取预警名称
     *
     * @return alert_name - 预警名称
     */
    public String getAlertName() {
        return alertName;
    }

    /**
     * 设置预警名称
     *
     * @param alertName 预警名称
     */
    public void setAlertName(String alertName) {
        this.alertName = alertName == null ? null : alertName.trim();
    }

    /**
     * 获取通知人手机号码
     *
     * @return mobile - 通知人手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置通知人手机号码
     *
     * @param mobile 通知人手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取通知人邮箱号码
     *
     * @return email - 通知人邮箱号码
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置通知人邮箱号码
     *
     * @param email 通知人邮箱号码
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    /**
     * 获取单个接口失败率
     *
     * @return fail_rate - 单个接口失败率
     */
    public Double getFailRate() {
        return failRate;
    }

    /**
     * 设置单个接口失败率
     *
     * @param failRate 单个接口失败率
     */
    public void setFailRate(Double failRate) {
        this.failRate = failRate;
    }

    /**
     * 获取单个接口失败次数
     *
     * @return fail_count - 单个接口失败次数
     */
    public Integer getFailCount() {
        return failCount;
    }

    /**
     * 设置单个接口失败次数
     *
     * @param failCount 单个接口失败次数
     */
    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    /**
     * 获取调用方配置
     *
     * @return app_ids - 调用方配置
     */
    public String getAppIds() {
        return appIds;
    }

    /**
     * 设置调用方配置
     *
     * @param appIds 调用方配置
     */
    public void setAppIds(String appIds) {
        this.appIds = appIds == null ? null : appIds.trim();
    }
}