package com.bdscams.amstest.entity;

import java.util.Date;

public class Apply_approve {
    private Long id;

    private String uuid;

    private Long applyUser;

    private Long applyDevType;

    private Long price;

    private Long num;

    private String applyReason;

    private String applyNote;

    private Date createTime;

    private Integer isDelete;

    private Integer isAllow;

    private Integer isApproved;

    private String approveReason;

    private Long approveUser;

    private Date approveTime;

    private Long approveDev;

    private String applyDevName;

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

    public Long getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(Long applyUser) {
        this.applyUser = applyUser;
    }

    public Long getApplyDevType() {
        return applyDevType;
    }

    public void setApplyDevType(Long applyDevType) {
        this.applyDevType = applyDevType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public String getApplyNote() {
        return applyNote;
    }

    public void setApplyNote(String applyNote) {
        this.applyNote = applyNote == null ? null : applyNote.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsAllow() {
        return isAllow;
    }

    public void setIsAllow(Integer isAllow) {
        this.isAllow = isAllow;
    }

    public Integer getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }

    public String getApproveReason() {
        return approveReason;
    }

    public void setApproveReason(String approveReason) {
        this.approveReason = approveReason == null ? null : approveReason.trim();
    }

    public Long getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(Long approveUser) {
        this.approveUser = approveUser;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Long getApproveDev() {
        return approveDev;
    }

    public void setApproveDev(Long approveDev) {
        this.approveDev = approveDev;
    }

    public String getApplyDevName() {
        return applyDevName;
    }

    public void setApplyDevName(String applyDevName) {
        this.applyDevName = applyDevName == null ? null : applyDevName.trim();
    }
}