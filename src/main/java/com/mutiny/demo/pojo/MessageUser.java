package com.mutiny.demo.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Message_User
 *
 * @mbg.generated do_not_delete_during_merge 2020-03-21 14:40:16
 */
public class MessageUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_User.Message_User_ID
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    private Integer messageUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_User.user_id
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_User.Message_Info_ID
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    private Integer messageInfoId;

    /**
     * Database Column Remarks:
     *   删除 1 OR不删除 0
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_User.status
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_User.Message_User_ID
     *
     * @return the value of Message_User.Message_User_ID
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public Integer getMessageUserId() {
        return messageUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_User.Message_User_ID
     *
     * @param messageUserId the value for Message_User.Message_User_ID
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public void setMessageUserId(Integer messageUserId) {
        this.messageUserId = messageUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_User.user_id
     *
     * @return the value of Message_User.user_id
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_User.user_id
     *
     * @param userId the value for Message_User.user_id
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_User.Message_Info_ID
     *
     * @return the value of Message_User.Message_Info_ID
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public Integer getMessageInfoId() {
        return messageInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_User.Message_Info_ID
     *
     * @param messageInfoId the value for Message_User.Message_Info_ID
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public void setMessageInfoId(Integer messageInfoId) {
        this.messageInfoId = messageInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_User.status
     *
     * @return the value of Message_User.status
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_User.status
     *
     * @param status the value for Message_User.status
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-21 14:40:16
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageUserId=").append(messageUserId);
        sb.append(", userId=").append(userId);
        sb.append(", messageInfoId=").append(messageInfoId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}