package com.bdscams.amstest.entity;

public class Dev_type_detai {
    private Long id;

    private Long typeId;

    private Long devId;

    private String devCpu;

    private String devMem;

    private String devDisk;

    private String devOther;

    private String devSpec;

    private String devSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public String getDevCpu() {
        return devCpu;
    }

    public void setDevCpu(String devCpu) {
        this.devCpu = devCpu == null ? null : devCpu.trim();
    }

    public String getDevMem() {
        return devMem;
    }

    public void setDevMem(String devMem) {
        this.devMem = devMem == null ? null : devMem.trim();
    }

    public String getDevDisk() {
        return devDisk;
    }

    public void setDevDisk(String devDisk) {
        this.devDisk = devDisk == null ? null : devDisk.trim();
    }

    public String getDevOther() {
        return devOther;
    }

    public void setDevOther(String devOther) {
        this.devOther = devOther == null ? null : devOther.trim();
    }

    public String getDevSpec() {
        return devSpec;
    }

    public void setDevSpec(String devSpec) {
        this.devSpec = devSpec == null ? null : devSpec.trim();
    }

    public String getDevSize() {
        return devSize;
    }

    public void setDevSize(String devSize) {
        this.devSize = devSize == null ? null : devSize.trim();
    }
}