package com.siyuanren.education.user.api.dto;

import java.io.Serializable;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.api.dto.UserInfoDTO
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
public class UserInfoDTO implements Serializable {


    private static final long serialVersionUID = 5921543835681299838L;
    private Integer userId;
    private String userName;
    private String realName;
    private String phone;
    private String email;
    private String courseAdvisor;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseAdvisor() {
        return courseAdvisor;
    }

    public void setCourseAdvisor(String courseAdvisor) {
        this.courseAdvisor = courseAdvisor;
    }
}
