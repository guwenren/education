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