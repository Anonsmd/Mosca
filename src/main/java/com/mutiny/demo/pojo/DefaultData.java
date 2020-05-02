package com.mutiny.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table DefaultData
 *
 * @mbg.generated do_not_delete_during_merge 2020-05-02 14:58:28
 */
public class DefaultData implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.DefaultModule_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Integer defaultmoduleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.Default_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Integer defaultId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.Data_Name
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private String dataName;

    /**
     * Database Column Remarks:
     *   [是否计算完毕]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.Is_Calculate
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Boolean isCalculate;

    /**
     * Database Column Remarks:
     *   [是否为有效]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.Is_Userful
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Boolean isUserful;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.Description
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private String description;

    /**
     * Database Column Remarks:
     *   [保存的数据]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.File_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.KeyFileId
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Integer keyfileid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.FileAswId
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Integer fileaswid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.uptime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Date uptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.caltime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Date caltime;

    /**
     * Database Column Remarks:
     *   0未上传 1已上传 2 已失效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.status
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   CURRENT_TIMESTAMP 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.createTime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DefaultData.completeTime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private Date completetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.DefaultModule_ID
     *
     * @return the value of DefaultData.DefaultModule_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Integer getDefaultmoduleId() {
        return defaultmoduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.DefaultModule_ID
     *
     * @param defaultmoduleId the value for DefaultData.DefaultModule_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setDefaultmoduleId(Integer defaultmoduleId) {
        this.defaultmoduleId = defaultmoduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.Default_ID
     *
     * @return the value of DefaultData.Default_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Integer getDefaultId() {
        return defaultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.Default_ID
     *
     * @param defaultId the value for DefaultData.Default_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setDefaultId(Integer defaultId) {
        this.defaultId = defaultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.Data_Name
     *
     * @return the value of DefaultData.Data_Name
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.Data_Name
     *
     * @param dataName the value for DefaultData.Data_Name
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.Is_Calculate
     *
     * @return the value of DefaultData.Is_Calculate
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Boolean getIsCalculate() {
        return isCalculate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.Is_Calculate
     *
     * @param isCalculate the value for DefaultData.Is_Calculate
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setIsCalculate(Boolean isCalculate) {
        this.isCalculate = isCalculate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.Is_Userful
     *
     * @return the value of DefaultData.Is_Userful
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Boolean getIsUserful() {
        return isUserful;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.Is_Userful
     *
     * @param isUserful the value for DefaultData.Is_Userful
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setIsUserful(Boolean isUserful) {
        this.isUserful = isUserful;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.Description
     *
     * @return the value of DefaultData.Description
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.Description
     *
     * @param description the value for DefaultData.Description
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.File_ID
     *
     * @return the value of DefaultData.File_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.File_ID
     *
     * @param fileId the value for DefaultData.File_ID
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.KeyFileId
     *
     * @return the value of DefaultData.KeyFileId
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Integer getKeyfileid() {
        return keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.KeyFileId
     *
     * @param keyfileid the value for DefaultData.KeyFileId
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setKeyfileid(Integer keyfileid) {
        this.keyfileid = keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.FileAswId
     *
     * @return the value of DefaultData.FileAswId
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Integer getFileaswid() {
        return fileaswid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.FileAswId
     *
     * @param fileaswid the value for DefaultData.FileAswId
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setFileaswid(Integer fileaswid) {
        this.fileaswid = fileaswid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.uptime
     *
     * @return the value of DefaultData.uptime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Date getUptime() {
        return uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.uptime
     *
     * @param uptime the value for DefaultData.uptime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.caltime
     *
     * @return the value of DefaultData.caltime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Date getCaltime() {
        return caltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.caltime
     *
     * @param caltime the value for DefaultData.caltime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setCaltime(Date caltime) {
        this.caltime = caltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.status
     *
     * @return the value of DefaultData.status
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.status
     *
     * @param status the value for DefaultData.status
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.createTime
     *
     * @return the value of DefaultData.createTime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.createTime
     *
     * @param createtime the value for DefaultData.createTime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DefaultData.completeTime
     *
     * @return the value of DefaultData.completeTime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public Date getCompletetime() {
        return completetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DefaultData.completeTime
     *
     * @param completetime the value for DefaultData.completeTime
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", defaultmoduleId=").append(defaultmoduleId);
        sb.append(", defaultId=").append(defaultId);
        sb.append(", dataName=").append(dataName);
        sb.append(", isCalculate=").append(isCalculate);
        sb.append(", isUserful=").append(isUserful);
        sb.append(", description=").append(description);
        sb.append(", fileId=").append(fileId);
        sb.append(", keyfileid=").append(keyfileid);
        sb.append(", fileaswid=").append(fileaswid);
        sb.append(", uptime=").append(uptime);
        sb.append(", caltime=").append(caltime);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append(", completetime=").append(completetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}