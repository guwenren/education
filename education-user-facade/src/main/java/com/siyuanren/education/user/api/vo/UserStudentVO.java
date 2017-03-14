package com.siyuanren.education.user.api.vo;

import com.siyuanren.education.common.web.vo.BaseVO;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.user.api.vo.UserStudentVO
 * Date         2017/3/14
 * Time         18:07
 * Description
 */
public class UserStudentVO extends BaseVO {
    private String mobile; //手机号码
    private String userName; //用户名称
    private String verificationCode; //验证码
    private String password; //

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
