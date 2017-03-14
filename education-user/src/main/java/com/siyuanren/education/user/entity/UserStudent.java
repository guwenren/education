package com.siyuanren.education.user.entity;

import com.siyuanren.education.common.entity.BaseEntity;

import java.util.Date;

public class UserStudent extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private String userName;
    private String mobileCountry;
    private String mobile;
    private Byte mobileVerified;
    private String passwordEncrypt;
    private Long createdAt;
    private String webToken;
    private String appToken;
    private Byte disabled;
    private String courseAdvisor;
    private Byte registerFrom;
    private Integer agencyId;
    private String profileImage;
    private String nickname;
    private String sex;
    private Date birthday;
    private Integer educationalBackgroundCode;
    private Integer professionCode;
    private String email;
    private String qq;
    private String province;
    private String city;
    private String address;
    private String realName;
    private String certificatePhoto;
    private Integer typesOfDocumentsCode;
    private String idNumber;
    private String idcardImage;
    private String zipCode;
    private String phoneAuthenticationCode;
    private Boolean phoneAuthenticationFlag;
    private Date phoneUnboundTipDate;
    private Boolean isDemo;
    private Date lastTimePrompt;
    private Boolean perfectMark;
    private String mfcCertificate;
    private String psyCertificate;
    private String hypCertificate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobileCountry() {
        return mobileCountry;
    }

    public void setMobileCountry(String mobileCountry) {
        this.mobileCountry = mobileCountry == null ? null : mobileCountry.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(Byte mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public String getPasswordEncrypt() {
        return passwordEncrypt;
    }

    public void setPasswordEncrypt(String passwordEncrypt) {
        this.passwordEncrypt = passwordEncrypt == null ? null : passwordEncrypt.trim();
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getWebToken() {
        return webToken;
    }

    public void setWebToken(String webToken) {
        this.webToken = webToken == null ? null : webToken.trim();
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken == null ? null : appToken.trim();
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    public String getCourseAdvisor() {
        return courseAdvisor;
    }

    public void setCourseAdvisor(String courseAdvisor) {
        this.courseAdvisor = courseAdvisor == null ? null : courseAdvisor.trim();
    }

    public Byte getRegisterFrom() {
        return registerFrom;
    }

    public void setRegisterFrom(Byte registerFrom) {
        this.registerFrom = registerFrom;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage == null ? null : profileImage.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getEducationalBackgroundCode() {
        return educationalBackgroundCode;
    }

    public void setEducationalBackgroundCode(Integer educationalBackgroundCode) {
        this.educationalBackgroundCode = educationalBackgroundCode;
    }

    public Integer getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(Integer professionCode) {
        this.professionCode = professionCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCertificatePhoto() {
        return certificatePhoto;
    }

    public void setCertificatePhoto(String certificatePhoto) {
        this.certificatePhoto = certificatePhoto == null ? null : certificatePhoto.trim();
    }

    public Integer getTypesOfDocumentsCode() {
        return typesOfDocumentsCode;
    }

    public void setTypesOfDocumentsCode(Integer typesOfDocumentsCode) {
        this.typesOfDocumentsCode = typesOfDocumentsCode;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getIdcardImage() {
        return idcardImage;
    }

    public void setIdcardImage(String idcardImage) {
        this.idcardImage = idcardImage == null ? null : idcardImage.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getPhoneAuthenticationCode() {
        return phoneAuthenticationCode;
    }

    public void setPhoneAuthenticationCode(String phoneAuthenticationCode) {
        this.phoneAuthenticationCode = phoneAuthenticationCode == null ? null : phoneAuthenticationCode.trim();
    }

    public Boolean getPhoneAuthenticationFlag() {
        return phoneAuthenticationFlag;
    }

    public void setPhoneAuthenticationFlag(Boolean phoneAuthenticationFlag) {
        this.phoneAuthenticationFlag = phoneAuthenticationFlag;
    }

    public Date getPhoneUnboundTipDate() {
        return phoneUnboundTipDate;
    }

    public void setPhoneUnboundTipDate(Date phoneUnboundTipDate) {
        this.phoneUnboundTipDate = phoneUnboundTipDate;
    }

    public Boolean getIsDemo() {
        return isDemo;
    }

    public void setIsDemo(Boolean isDemo) {
        this.isDemo = isDemo;
    }

    public Date getLastTimePrompt() {
        return lastTimePrompt;
    }

    public void setLastTimePrompt(Date lastTimePrompt) {
        this.lastTimePrompt = lastTimePrompt;
    }

    public Boolean getPerfectMark() {
        return perfectMark;
    }

    public void setPerfectMark(Boolean perfectMark) {
        this.perfectMark = perfectMark;
    }

    public String getMfcCertificate() {
        return mfcCertificate;
    }

    public void setMfcCertificate(String mfcCertificate) {
        this.mfcCertificate = mfcCertificate == null ? null : mfcCertificate.trim();
    }

    public String getPsyCertificate() {
        return psyCertificate;
    }

    public void setPsyCertificate(String psyCertificate) {
        this.psyCertificate = psyCertificate == null ? null : psyCertificate.trim();
    }

    public String getHypCertificate() {
        return hypCertificate;
    }

    public void setHypCertificate(String hypCertificate) {
        this.hypCertificate = hypCertificate == null ? null : hypCertificate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(getId());
        sb.append(", userName=").append(userName);
        sb.append(", mobileCountry=").append(mobileCountry);
        sb.append(", mobile=").append(mobile);
        sb.append(", mobileVerified=").append(mobileVerified);
        sb.append(", passwordEncrypt=").append(passwordEncrypt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", webToken=").append(webToken);
        sb.append(", appToken=").append(appToken);
        sb.append(", disabled=").append(disabled);
        sb.append(", courseAdvisor=").append(courseAdvisor);
        sb.append(", registerFrom=").append(registerFrom);
        sb.append(", agencyId=").append(agencyId);
        sb.append(", profileImage=").append(profileImage);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", educationalBackgroundCode=").append(educationalBackgroundCode);
        sb.append(", professionCode=").append(professionCode);
        sb.append(", email=").append(email);
        sb.append(", qq=").append(qq);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", realName=").append(realName);
        sb.append(", certificatePhoto=").append(certificatePhoto);
        sb.append(", typesOfDocumentsCode=").append(typesOfDocumentsCode);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", idcardImage=").append(idcardImage);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", phoneAuthenticationCode=").append(phoneAuthenticationCode);
        sb.append(", phoneAuthenticationFlag=").append(phoneAuthenticationFlag);
        sb.append(", phoneUnboundTipDate=").append(phoneUnboundTipDate);
        sb.append(", isDemo=").append(isDemo);
        sb.append(", lastTimePrompt=").append(lastTimePrompt);
        sb.append(", perfectMark=").append(perfectMark);
        sb.append(", mfcCertificate=").append(mfcCertificate);
        sb.append(", psyCertificate=").append(psyCertificate);
        sb.append(", hypCertificate=").append(hypCertificate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}