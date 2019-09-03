package com.bdscams.amstest.entity;

import java.util.Date;

public class Chat {
    private Integer id;

    private String usernameid;

    private String friendnameid;

    private String message;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}