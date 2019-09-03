package com.bdscams.amstest.entity;

import java.util.Date;

public class Apply_change_devUser {
    private Long id;

    private String devName;

    private String devNum;

    private Long devRespUser;

    private Long devDept;

    private Long devType;

    private String devDesc;

    private Float price;

    private Short number;

    private Date updateTime;

    private Date createTime;

    private Integer isScrap;

    private Byte isFixed;

    private Integer isDelete;

    private Long receiveUser;

    private Integer isAllow;

    private Integer isApprove;

    private Date applyTime;

    private Long deviceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getDevNum() {
        return devNum;
    }

    public void setDevNum(String devNum) {
        this.devNum = devNum == null ? null : devNum.trim();
    }

    public Long getDevRespUser() {
        return devRespUser;
    }

    public void setDevRespUser(Long devRespUser) {
        this.devRespUser = devRespUser;
    }

    public Long getDevDept() {
        return devDept;
    }

    public void setDevDept(Long devDept) {
        this.devDept = devDept;
    }

    public Long getDevType() {
        return devType;
    }

    public void setDevType(Long devType) {
        this.devType = devType;
    }

    public String getDevDesc() {
        return devDesc;
    }

    public void setDevDesc(String devDesc) {
        this.devDesc = devDesc == null ? null : devDesc.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsScrap() {
        return isScrap;
    }

    public void setIsScrap(Integer isScrap) {
        this.isScrap = isScrap;
    }

    public Byte getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Byte isFixed) {
        this.isFixed = isFixed;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(Long receiveUser) {
        this.receiveUser = receiveUser;
    }

    public Integer getIsAllow() {
        return isAllow;
    }

    public void setIsAllow(Integer isAllow) {
        this.isAllow = isAllow;
    }

    public Integer getIsApprove() {
        return isApprove;
    }

    public void setIsApprove(Integer isApprove) {
        this.isApprove = isApprove;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
}