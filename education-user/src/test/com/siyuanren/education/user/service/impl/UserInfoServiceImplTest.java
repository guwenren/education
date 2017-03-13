package com.siyuanren.education.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.siyuanren.education.user.BaseTest;
import com.siyuanren.education.user.entity.UserInfo;
import com.siyuanren.education.user.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.user.service.impl.UserInfoServiceImplTest
 * Date         2017/3/13
 * Time         10:37
 * Description
 */
public class UserInfoServiceImplTest extends BaseTest{

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void getById() throws Exception {
        UserInfo userInfo = userInfoService.getById(1);
        System.out.println("userInfo = " + JSON.toJSONString(userInfo));
    }
}