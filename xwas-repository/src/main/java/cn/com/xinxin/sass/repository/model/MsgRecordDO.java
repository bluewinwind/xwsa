package cn.com.xinxin.sass.repository.model;

import java.util.Date;

public class MsgRecordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.org_id
     *
     * @mbg.generated
     */
    private String orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.seq_id
     *
     * @mbg.generated
     */
    private Long seqId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.msg_id
     *
     * @mbg.generated
     */
    private String msgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.action
     *
     * @mbg.generated
     */
    private String action;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.from_user_id
     *
     * @mbg.generated
     */
    private String fromUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.room_id
     *
     * @mbg.generated
     */
    private String roomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.msg_time
     *
     * @mbg.generated
     */
    private String msgTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.msg_type
     *
     * @mbg.generated
     */
    private String msgType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.task_id
     *
     * @mbg.generated
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.extension
     *
     * @mbg.generated
     */
    private String extension;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.gmt_created
     *
     * @mbg.generated
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.gmt_creator
     *
     * @mbg.generated
     */
    private String gmtCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.gmt_updated
     *
     * @mbg.generated
     */
    private Date gmtUpdated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.gmt_updater
     *
     * @mbg.generated
     */
    private String gmtUpdater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.deleted
     *
     * @mbg.generated
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.id
     *
     * @return the value of msg_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.id
     *
     * @param id the value for msg_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.org_id
     *
     * @return the value of msg_record.org_id
     *
     * @mbg.generated
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.org_id
     *
     * @param orgId the value for msg_record.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.seq_id
     *
     * @return the value of msg_record.seq_id
     *
     * @mbg.generated
     */
    public Long getSeqId() {
        return seqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.seq_id
     *
     * @param seqId the value for msg_record.seq_id
     *
     * @mbg.generated
     */
    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.msg_id
     *
     * @return the value of msg_record.msg_id
     *
     * @mbg.generated
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.msg_id
     *
     * @param msgId the value for msg_record.msg_id
     *
     * @mbg.generated
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.action
     *
     * @return the value of msg_record.action
     *
     * @mbg.generated
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.action
     *
     * @param action the value for msg_record.action
     *
     * @mbg.generated
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.from_user_id
     *
     * @return the value of msg_record.from_user_id
     *
     * @mbg.generated
     */
    public String getFromUserId() {
        return fromUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.from_user_id
     *
     * @param fromUserId the value for msg_record.from_user_id
     *
     * @mbg.generated
     */
    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId == null ? null : fromUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.room_id
     *
     * @return the value of msg_record.room_id
     *
     * @mbg.generated
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.room_id
     *
     * @param roomId the value for msg_record.room_id
     *
     * @mbg.generated
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.msg_time
     *
     * @return the value of msg_record.msg_time
     *
     * @mbg.generated
     */
    public String getMsgTime() {
        return msgTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.msg_time
     *
     * @param msgTime the value for msg_record.msg_time
     *
     * @mbg.generated
     */
    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime == null ? null : msgTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.msg_type
     *
     * @return the value of msg_record.msg_type
     *
     * @mbg.generated
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.msg_type
     *
     * @param msgType the value for msg_record.msg_type
     *
     * @mbg.generated
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.task_id
     *
     * @return the value of msg_record.task_id
     *
     * @mbg.generated
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.task_id
     *
     * @param taskId the value for msg_record.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.extension
     *
     * @return the value of msg_record.extension
     *
     * @mbg.generated
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.extension
     *
     * @param extension the value for msg_record.extension
     *
     * @mbg.generated
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.gmt_created
     *
     * @return the value of msg_record.gmt_created
     *
     * @mbg.generated
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.gmt_created
     *
     * @param gmtCreated the value for msg_record.gmt_created
     *
     * @mbg.generated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.gmt_creator
     *
     * @return the value of msg_record.gmt_creator
     *
     * @mbg.generated
     */
    public String getGmtCreator() {
        return gmtCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.gmt_creator
     *
     * @param gmtCreator the value for msg_record.gmt_creator
     *
     * @mbg.generated
     */
    public void setGmtCreator(String gmtCreator) {
        this.gmtCreator = gmtCreator == null ? null : gmtCreator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.gmt_updated
     *
     * @return the value of msg_record.gmt_updated
     *
     * @mbg.generated
     */
    public Date getGmtUpdated() {
        return gmtUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.gmt_updated
     *
     * @param gmtUpdated the value for msg_record.gmt_updated
     *
     * @mbg.generated
     */
    public void setGmtUpdated(Date gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.gmt_updater
     *
     * @return the value of msg_record.gmt_updater
     *
     * @mbg.generated
     */
    public String getGmtUpdater() {
        return gmtUpdater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.gmt_updater
     *
     * @param gmtUpdater the value for msg_record.gmt_updater
     *
     * @mbg.generated
     */
    public void setGmtUpdater(String gmtUpdater) {
        this.gmtUpdater = gmtUpdater == null ? null : gmtUpdater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.deleted
     *
     * @return the value of msg_record.deleted
     *
     * @mbg.generated
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.deleted
     *
     * @param deleted the value for msg_record.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.to_user_id
     *
     * @mbg.generated
     */
    private String toUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_record.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.to_user_id
     *
     * @return the value of msg_record.to_user_id
     *
     * @mbg.generated
     */
    public String getToUserId() {
        return toUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.to_user_id
     *
     * @param toUserId the value for msg_record.to_user_id
     *
     * @mbg.generated
     */
    public void setToUserId(String toUserId) {
        this.toUserId = toUserId == null ? null : toUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_record.content
     *
     * @return the value of msg_record.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_record.content
     *
     * @param content the value for msg_record.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}