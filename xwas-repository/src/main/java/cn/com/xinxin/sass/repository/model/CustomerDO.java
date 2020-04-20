package cn.com.xinxin.sass.repository.model;

import java.util.Date;

public class CustomerDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.no
     *
     * @mbg.generated
     */
    private String no;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_type_code
     *
     * @mbg.generated
     */
    private String customerTypeCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.full_name
     *
     * @mbg.generated
     */
    private String fullName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.gender
     *
     * @mbg.generated
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.age
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.credentials
     *
     * @mbg.generated
     */
    private String credentials;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.credentials_no
     *
     * @mbg.generated
     */
    private String credentialsNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.credentials_org
     *
     * @mbg.generated
     */
    private String credentialsOrg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.home_address
     *
     * @mbg.generated
     */
    private String homeAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.civil_state
     *
     * @mbg.generated
     */
    private String civilState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.birthday
     *
     * @mbg.generated
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.education
     *
     * @mbg.generated
     */
    private String education;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.emg_contact
     *
     * @mbg.generated
     */
    private String emgContact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.emg_contact_way
     *
     * @mbg.generated
     */
    private String emgContactWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.gmt_created
     *
     * @mbg.generated
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.gmt_creator
     *
     * @mbg.generated
     */
    private String gmtCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.gmt_updated
     *
     * @mbg.generated
     */
    private Date gmtUpdated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.gmt_updater
     *
     * @mbg.generated
     */
    private String gmtUpdater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.extension
     *
     * @mbg.generated
     */
    private String extension;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.id
     *
     * @return the value of customer.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.id
     *
     * @param id the value for customer.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.no
     *
     * @return the value of customer.no
     *
     * @mbg.generated
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.no
     *
     * @param no the value for customer.no
     *
     * @mbg.generated
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_type_code
     *
     * @return the value of customer.customer_type_code
     *
     * @mbg.generated
     */
    public String getCustomerTypeCode() {
        return customerTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_type_code
     *
     * @param customerTypeCode the value for customer.customer_type_code
     *
     * @mbg.generated
     */
    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode == null ? null : customerTypeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.full_name
     *
     * @return the value of customer.full_name
     *
     * @mbg.generated
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.full_name
     *
     * @param fullName the value for customer.full_name
     *
     * @mbg.generated
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.mobile
     *
     * @return the value of customer.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.mobile
     *
     * @param mobile the value for customer.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.phone
     *
     * @return the value of customer.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.phone
     *
     * @param phone the value for customer.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.gender
     *
     * @return the value of customer.gender
     *
     * @mbg.generated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.gender
     *
     * @param gender the value for customer.gender
     *
     * @mbg.generated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.age
     *
     * @return the value of customer.age
     *
     * @mbg.generated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.age
     *
     * @param age the value for customer.age
     *
     * @mbg.generated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.credentials
     *
     * @return the value of customer.credentials
     *
     * @mbg.generated
     */
    public String getCredentials() {
        return credentials;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.credentials
     *
     * @param credentials the value for customer.credentials
     *
     * @mbg.generated
     */
    public void setCredentials(String credentials) {
        this.credentials = credentials == null ? null : credentials.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.credentials_no
     *
     * @return the value of customer.credentials_no
     *
     * @mbg.generated
     */
    public String getCredentialsNo() {
        return credentialsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.credentials_no
     *
     * @param credentialsNo the value for customer.credentials_no
     *
     * @mbg.generated
     */
    public void setCredentialsNo(String credentialsNo) {
        this.credentialsNo = credentialsNo == null ? null : credentialsNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.credentials_org
     *
     * @return the value of customer.credentials_org
     *
     * @mbg.generated
     */
    public String getCredentialsOrg() {
        return credentialsOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.credentials_org
     *
     * @param credentialsOrg the value for customer.credentials_org
     *
     * @mbg.generated
     */
    public void setCredentialsOrg(String credentialsOrg) {
        this.credentialsOrg = credentialsOrg == null ? null : credentialsOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.home_address
     *
     * @return the value of customer.home_address
     *
     * @mbg.generated
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.home_address
     *
     * @param homeAddress the value for customer.home_address
     *
     * @mbg.generated
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.civil_state
     *
     * @return the value of customer.civil_state
     *
     * @mbg.generated
     */
    public String getCivilState() {
        return civilState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.civil_state
     *
     * @param civilState the value for customer.civil_state
     *
     * @mbg.generated
     */
    public void setCivilState(String civilState) {
        this.civilState = civilState == null ? null : civilState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.birthday
     *
     * @return the value of customer.birthday
     *
     * @mbg.generated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.birthday
     *
     * @param birthday the value for customer.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.education
     *
     * @return the value of customer.education
     *
     * @mbg.generated
     */
    public String getEducation() {
        return education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.education
     *
     * @param education the value for customer.education
     *
     * @mbg.generated
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.emg_contact
     *
     * @return the value of customer.emg_contact
     *
     * @mbg.generated
     */
    public String getEmgContact() {
        return emgContact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.emg_contact
     *
     * @param emgContact the value for customer.emg_contact
     *
     * @mbg.generated
     */
    public void setEmgContact(String emgContact) {
        this.emgContact = emgContact == null ? null : emgContact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.emg_contact_way
     *
     * @return the value of customer.emg_contact_way
     *
     * @mbg.generated
     */
    public String getEmgContactWay() {
        return emgContactWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.emg_contact_way
     *
     * @param emgContactWay the value for customer.emg_contact_way
     *
     * @mbg.generated
     */
    public void setEmgContactWay(String emgContactWay) {
        this.emgContactWay = emgContactWay == null ? null : emgContactWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.description
     *
     * @return the value of customer.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.description
     *
     * @param description the value for customer.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.gmt_created
     *
     * @return the value of customer.gmt_created
     *
     * @mbg.generated
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.gmt_created
     *
     * @param gmtCreated the value for customer.gmt_created
     *
     * @mbg.generated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.gmt_creator
     *
     * @return the value of customer.gmt_creator
     *
     * @mbg.generated
     */
    public String getGmtCreator() {
        return gmtCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.gmt_creator
     *
     * @param gmtCreator the value for customer.gmt_creator
     *
     * @mbg.generated
     */
    public void setGmtCreator(String gmtCreator) {
        this.gmtCreator = gmtCreator == null ? null : gmtCreator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.gmt_updated
     *
     * @return the value of customer.gmt_updated
     *
     * @mbg.generated
     */
    public Date getGmtUpdated() {
        return gmtUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.gmt_updated
     *
     * @param gmtUpdated the value for customer.gmt_updated
     *
     * @mbg.generated
     */
    public void setGmtUpdated(Date gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.gmt_updater
     *
     * @return the value of customer.gmt_updater
     *
     * @mbg.generated
     */
    public String getGmtUpdater() {
        return gmtUpdater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.gmt_updater
     *
     * @param gmtUpdater the value for customer.gmt_updater
     *
     * @mbg.generated
     */
    public void setGmtUpdater(String gmtUpdater) {
        this.gmtUpdater = gmtUpdater == null ? null : gmtUpdater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.extension
     *
     * @return the value of customer.extension
     *
     * @mbg.generated
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.extension
     *
     * @param extension the value for customer.extension
     *
     * @mbg.generated
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.deleted
     *
     * @return the value of customer.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.deleted
     *
     * @param deleted the value for customer.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}