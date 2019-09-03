package com.bdscams.amstest.entity;

import java.util.Date;

public class Opt_log {
    private Long id;

    private String uuid;

    private Long logLevel;

    private Long optType;

    private String optDesc;

    private Long optUser;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Long getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(Long logLevel) {
        this.logLevel = logLevel;
    }

    public Long getOptType() {
        return optType;
    }

    public void setOptType(Long optType) {
        this.optType = optType;
    }

    public String getOptDesc() {
        return optDesc;
    }

    public void setOptDesc(String optDesc) {
        this.optDesc = optDesc == null ? null : optDesc.trim();
    }

    public Long getOptUser() {
        return optUser;
    }

    public void setOptUser(Long optUser) {
        this.optUser = optUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}