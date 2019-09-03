package com.bdscams.amstest.entity;

public class Friends {
    private Integer id;

    private String usernameid;

    private String friendnameid;

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
}