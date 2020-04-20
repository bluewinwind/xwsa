package cn.com.xinxin.sass.repository.model;

import java.util.Date;

public class CustomerReceivedDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.task_id
     *
     * @mbg.generated
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.org_id
     *
     * @mbg.generated
     */
    private String orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.avatar
     *
     * @mbg.generated
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.gender
     *
     * @mbg.generated
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.unionid
     *
     * @mbg.generated
     */
    private String unionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.position
     *
     * @mbg.generated
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.corp_name
     *
     * @mbg.generated
     */
    private String corpName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.corp_full_name
     *
     * @mbg.generated
     */
    private String corpFullName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.external_profile
     *
     * @mbg.generated
     */
    private String externalProfile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.follow_user
     *
     * @mbg.generated
     */
    private String followUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.extension
     *
     * @mbg.generated
     */
    private String extension;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.gmt_created
     *
     * @mbg.generated
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.gmt_creator
     *
     * @mbg.generated
     */
    private String gmtCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.gmt_updated
     *
     * @mbg.generated
     */
    private Date gmtUpdated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.gmt_updater
     *
     * @mbg.generated
     */
    private String gmtUpdater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_received.deleted
     *
     * @mbg.generated
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.id
     *
     * @return the value of customer_received.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.id
     *
     * @param id the value for customer_received.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.task_id
     *
     * @return the value of customer_received.task_id
     *
     * @mbg.generated
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.task_id
     *
     * @param taskId the value for customer_received.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.org_id
     *
     * @return the value of customer_received.org_id
     *
     * @mbg.generated
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.org_id
     *
     * @param orgId the value for customer_received.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.user_id
     *
     * @return the value of customer_received.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.user_id
     *
     * @param userId the value for customer_received.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.name
     *
     * @return the value of customer_received.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.name
     *
     * @param name the value for customer_received.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.avatar
     *
     * @return the value of customer_received.avatar
     *
     * @mbg.generated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.avatar
     *
     * @param avatar the value for customer_received.avatar
     *
     * @mbg.generated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.type
     *
     * @return the value of customer_received.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.type
     *
     * @param type the value for customer_received.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.gender
     *
     * @return the value of customer_received.gender
     *
     * @mbg.generated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.gender
     *
     * @param gender the value for customer_received.gender
     *
     * @mbg.generated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.unionid
     *
     * @return the value of customer_received.unionid
     *
     * @mbg.generated
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.unionid
     *
     * @param unionid the value for customer_received.unionid
     *
     * @mbg.generated
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.position
     *
     * @return the value of customer_received.position
     *
     * @mbg.generated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.position
     *
     * @param position the value for customer_received.position
     *
     * @mbg.generated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.corp_name
     *
     * @return the value of customer_received.corp_name
     *
     * @mbg.generated
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.corp_name
     *
     * @param corpName the value for customer_received.corp_name
     *
     * @mbg.generated
     */
    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.corp_full_name
     *
     * @return the value of customer_received.corp_full_name
     *
     * @mbg.generated
     */
    public String getCorpFullName() {
        return corpFullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.corp_full_name
     *
     * @param corpFullName the value for customer_received.corp_full_name
     *
     * @mbg.generated
     */
    public void setCorpFullName(String corpFullName) {
        this.corpFullName = corpFullName == null ? null : corpFullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.external_profile
     *
     * @return the value of customer_received.external_profile
     *
     * @mbg.generated
     */
    public String getExternalProfile() {
        return externalProfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.external_profile
     *
     * @param externalProfile the value for customer_received.external_profile
     *
     * @mbg.generated
     */
    public void setExternalProfile(String externalProfile) {
        this.externalProfile = externalProfile == null ? null : externalProfile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.follow_user
     *
     * @return the value of customer_received.follow_user
     *
     * @mbg.generated
     */
    public String getFollowUser() {
        return followUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.follow_user
     *
     * @param followUser the value for customer_received.follow_user
     *
     * @mbg.generated
     */
    public void setFollowUser(String followUser) {
        this.followUser = followUser == null ? null : followUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.extension
     *
     * @return the value of customer_received.extension
     *
     * @mbg.generated
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.extension
     *
     * @param extension the value for customer_received.extension
     *
     * @mbg.generated
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.gmt_created
     *
     * @return the value of customer_received.gmt_created
     *
     * @mbg.generated
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.gmt_created
     *
     * @param gmtCreated the value for customer_received.gmt_created
     *
     * @mbg.generated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.gmt_creator
     *
     * @return the value of customer_received.gmt_creator
     *
     * @mbg.generated
     */
    public String getGmtCreator() {
        return gmtCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.gmt_creator
     *
     * @param gmtCreator the value for customer_received.gmt_creator
     *
     * @mbg.generated
     */
    public void setGmtCreator(String gmtCreator) {
        this.gmtCreator = gmtCreator == null ? null : gmtCreator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.gmt_updated
     *
     * @return the value of customer_received.gmt_updated
     *
     * @mbg.generated
     */
    public Date getGmtUpdated() {
        return gmtUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.gmt_updated
     *
     * @param gmtUpdated the value for customer_received.gmt_updated
     *
     * @mbg.generated
     */
    public void setGmtUpdated(Date gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.gmt_updater
     *
     * @return the value of customer_received.gmt_updater
     *
     * @mbg.generated
     */
    public String getGmtUpdater() {
        return gmtUpdater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.gmt_updater
     *
     * @param gmtUpdater the value for customer_received.gmt_updater
     *
     * @mbg.generated
     */
    public void setGmtUpdater(String gmtUpdater) {
        this.gmtUpdater = gmtUpdater == null ? null : gmtUpdater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_received.deleted
     *
     * @return the value of customer_received.deleted
     *
     * @mbg.generated
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_received.deleted
     *
     * @param deleted the value for customer_received.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}