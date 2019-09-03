package com.bdscams.amstest.entity;

import java.util.Date;

public class Dev_application {
    private Long id;

    private Long applyUserId;

    private Long applyDevType;

    private Long applyDevId;

    private Date createTime;

    private Date updateTime;

    private Integer isApprove;

    private Long approveUserId;

    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Long applyUserId) {
        this.applyUserId = applyUserId;
    }

    public Long getApplyDevType() {
        return applyDevType;
    }

    public void setApplyDevType(Long applyDevType) {
        this.applyDevType = applyDevType;
    }

    public Long getApplyDevId() {
        return applyDevId;
    }

    public void setApplyDevId(Long applyDevId) {
        this.applyDevId = applyDevId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsApprove() {
        return isApprove;
    }

    public void setIsApprove(Integer isApprove) {
        this.isApprove = isApprove;
    }

    public Long getApproveUserId() {
        return approveUserId;
    }

    public void setApproveUserId(Long approveUserId) {
        this.approveUserId = approveUserId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}