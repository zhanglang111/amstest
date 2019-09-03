package com.bdscams.amstest.entity;

import java.util.Date;

public class Apply_friend {
    private Integer id;

    private String usernameid;

    private String friendnameid;

    private Integer isallow;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsernameid() {
        return usernameid;
    }

    public void setUsernameid(String usernameid) {
        this.usernameid = usernameid == null ? null : usernameid.trim();
    }

    public String getFriendnameid() {
        return friendnameid;
    }

    public void setFriendnameid(String friendnameid) {
        this.friendnameid = friendnameid == null ? null : friendnameid.trim();
    }

    public Integer getIsallow() {
        return isallow;
    }

    public void setIsallow(Integer isallow) {
        this.isallow = isallow;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}