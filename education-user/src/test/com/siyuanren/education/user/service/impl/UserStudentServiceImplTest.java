package com.siyuanren.education.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.siyuanren.education.user.BaseTest;
import com.siyuanren.education.user.entity.UserStudent;
import com.siyuanren.education.user.service.UserStudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.user.service.impl.UserStudentServiceImplTest
 * Date         2017/3/14
 * Time         15:44
 * Description
 */
public class UserStudentServiceImplTest extends BaseTest {

    @Autowired
    private UserStudentService userStudentService;

    @Test
    public void getById() throws Exception {
        UserStudent userStudent = userStudentService.getById(1);
        System.out.println("userStudent = " + JSON.toJSONString(userStudent));
    }

    @Test
    public void insert() throws Exception {
        UserStudent userStudent = new UserStudent();
        userStudent.setUserName("user_name");
        userStudent.setMobileCountry("86");
        userStudent.setMobile("13888888888");
        userStudent.setPasswordEncrypt("password_encrypt");
        userStudent.setWebToken("web_token");
        userStudent.setAppToken("app_token");
        userStudent.setCourseAdvisor("course_advisor");
        userStudent.setProfileImage("profile_image");
        userStudent.setNickname("nickname");
        userStudent.setSex("sex");
        userStudent.setEmail("email");
        userStudent.setQq("qq");
        userStudent.setProvince("province");
        userStudent.setCity("city");
        userStudent.setAddress("address");
        userStudent.setRealName("real_name");
        userStudent.setCertificatePhoto("certificate_photo");
        userStudent.setIdNumber("id_number");
        userStudent.setIdcardImage("idcard_image");
        userStudent.setMobileVerified((byte)0);
        userStudent.setCreatedAt(0L);
        userStudent.setDisabled((byte)1);
        userStudent.setRegisterFrom((byte)0);
        userStudent.setEducationalBackgroundCode(0);
        userStudent.setProfessionCode(0);
        userStudent.setTypesOfDocumentsCode(0);
        long insert = userStudentService.insert(userStudent);
        System.out.println("insert = " + insert);
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void deleteById() throws Exception {

    }

    @Test
    public void listBy() throws Exception {

    }

    @Test
    public void listPage() throws Exception {

    }

}