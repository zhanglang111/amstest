package com.bdscams.amstest.entity;

public class Menu_right {
    private Long id;

    private String rgtName;

    private String rgtDesc;

    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRgtName() {
        return rgtName;
    }

    public void setRgtName(String rgtName) {
        this.rgtName = rgtName == null ? null : rgtName.trim();
    }

    public String getRgtDesc() {
        return rgtDesc;
    }

    public void setRgtDesc(String rgtDesc) {
        this.rgtDesc = rgtDesc == null ? null : rgtDesc.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}