package com.jason.learning.datasource.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "xiaoya_finance.api_invoke")
public class ApiInvoke implements Serializable {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 调用方appid
     */
    private String appid;

    /**
     * 接口名
     */
    @Column(name = "interface_name")
    private String interfaceName;

    /**
     * 接口开始调用时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 接口用时
     */
    @Column(name = "consume_time")
    private Long consumeTime;

    /**
     * 接口返回code
     */
    private String code;

    /**
     * 接口返回message
     */
    @Column(name = "sub_message")
    private String subMessage;

    /**
     * 接口返回subcode
     */
    @Column(name = "sub_code")
    private String subCode;

    /**
     * 出入参
     */
    @Column(name = "io_params")
    private String ioParams;

    /**
     * 商户pid
     */
    private String pid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取调用方appid
     *
     * @return appid - 调用方appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置调用方appid
     *
     * @param appid 调用方appid
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取接口名
     *
     * @return interface_name - 接口名
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * 设置接口名
     *
     * @param interfaceName 接口名
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }

    /**
     * 获取接口开始调用时间
     *
     * @return start_time - 接口开始调用时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置接口开始调用时间
     *
     * @param startTime 接口开始调用时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取接口用时
     *
     * @return consume_time - 接口用时
     */
    public Long getConsumeTime() {
        return consumeTime;
    }

    /**
     * 设置接口用时
     *
     * @param consumeTime 接口用时
     */
    public void setConsumeTime(Long consumeTime) {
        this.consumeTime = consumeTime;
    }

    /**
     * 获取接口返回code
     *
     * @return code - 接口返回code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置接口返回code
     *
     * @param code 接口返回code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取接口返回message
     *
     * @return sub_message - 接口返回message
     */
    public String getSubMessage() {
        return subMessage;
    }

    /**
     * 设置接口返回message
     *
     * @param subMessage 接口返回message
     */
    public void setSubMessage(String subMessage) {
        this.subMessage = subMessage == null ? null : subMessage.trim();
    }

    /**
     * 获取接口返回subcode
     *
     * @return sub_code - 接口返回subcode
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * 设置接口返回subcode
     *
     * @param subCode 接口返回subcode
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode == null ? null : subCode.trim();
    }

    /**
     * 获取出入参
     *
     * @return io_params - 出入参
     */
    public String getIoParams() {
        return ioParams;
    }

    /**
     * 设置出入参
     *
     * @param ioParams 出入参
     */
    public void setIoParams(String ioParams) {
        this.ioParams = ioParams == null ? null : ioParams.trim();
    }

    /**
     * 获取商户pid
     *
     * @return pid - 商户pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置商户pid
     *
     * @param pid 商户pid
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}