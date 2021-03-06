package com.mutiny.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Module_User
 *
 * @mbg.generated do_not_delete_during_merge 2020-03-23 17:06:04
 */
public class ModuleUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.Relation_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private Integer relationId;

    /**
     * Database Column Remarks:
     *   外键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.Module_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private Integer moduleId;

    /**
     * Database Column Remarks:
     *   外键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.User_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   上传者/使用者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.Type
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private String type;

    /**
     * Database Column Remarks:
     *   是否已经授权 0 未处理 1 已授权 2 已拒绝
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.Is_Permiss
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private Integer isPermiss;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.ProjectId
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.startTime
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module_User.endTime
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private Date endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Module_User
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.Relation_ID
     *
     * @return the value of Module_User.Relation_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public Integer getRelationId() {
        return relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.Relation_ID
     *
     * @param relationId the value for Module_User.Relation_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.Module_ID
     *
     * @return the value of Module_User.Module_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.Module_ID
     *
     * @param moduleId the value for Module_User.Module_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.User_ID
     *
     * @return the value of Module_User.User_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.User_ID
     *
     * @param userId the value for Module_User.User_ID
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.Type
     *
     * @return the value of Module_User.Type
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.Type
     *
     * @param type the value for Module_User.Type
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.Is_Permiss
     *
     * @return the value of Module_User.Is_Permiss
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public Integer getIsPermiss() {
        return isPermiss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.Is_Permiss
     *
     * @param isPermiss the value for Module_User.Is_Permiss
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setIsPermiss(Integer isPermiss) {
        this.isPermiss = isPermiss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.ProjectId
     *
     * @return the value of Module_User.ProjectId
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.ProjectId
     *
     * @param projectid the value for Module_User.ProjectId
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.startTime
     *
     * @return the value of Module_User.startTime
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.startTime
     *
     * @param starttime the value for Module_User.startTime
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module_User.endTime
     *
     * @return the value of Module_User.endTime
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module_User.endTime
     *
     * @param endtime the value for Module_User.endTime
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Module_User
     *
     * @mbg.generated 2020-03-23 17:06:04
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relationId=").append(relationId);
        sb.append(", moduleId=").append(moduleId);
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", isPermiss=").append(isPermiss);
        sb.append(", projectid=").append(projectid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}