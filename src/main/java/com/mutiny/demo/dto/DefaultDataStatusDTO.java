package com.mutiny.demo.dto;

import java.util.Date;

public class DefaultDataStatusDTO {
    private String moduleName;
    private String dataName;
    private int defaultDataId;
    private int defaultId;
    private Date createTime;
    private Date upTime;
    private int status;

    public DefaultDataStatusDTO() {
    }

    public DefaultDataStatusDTO(String moduleName, String dataName, int defaultDataId, int defaultId, Date createTime, Date upTime, int status) {
        this.moduleName = moduleName;
        this.dataName = dataName;
        this.defaultDataId = defaultDataId;
        this.defaultId = defaultId;
        this.createTime = createTime;
        this.upTime = upTime;
        this.status = status;
    }

    public int getDefaultId() {
        return defaultId;
    }

    public void setDefaultId(int defaultId) {
        this.defaultId = defaultId;
    }

    public DefaultDataStatusDTO(String moduleName, String dataName, int defaultDataId,int defaultId) {
        this.moduleName = moduleName;
        this.dataName = dataName;
        this.defaultDataId = defaultDataId;
        this.defaultId = defaultId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public int getDefaultDataId() {
        return defaultDataId;
    }

    public void setDefaultDataId(int defaultDataId) {
        this.defaultDataId = defaultDataId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
