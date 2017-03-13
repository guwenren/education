package com.siyuanren.education.user.entity;

import com.siyuanren.education.common.entity.BaseEntity;

import java.io.Serializable;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.entity.UserInfo
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
public class UserInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1978384267467136513L;

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
