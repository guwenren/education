package com.siyuanren.education.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.siyuanren.education.common.page.PageBean;
import com.siyuanren.education.common.page.PageParam;
import com.siyuanren.education.user.BaseTest;
import com.siyuanren.education.user.entity.UserInfo;
import com.siyuanren.education.user.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.user.service.impl.UserInfoServiceImplTest
 * Date         2017/3/13
 * Time         10:37
 * Description
 */
public class UserInfoServiceImplTest extends BaseTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void listPage() throws Exception {
        Map<String, Object> params = new HashMap<>();
//        params.put("email", "389235298@qq.com");
        PageParam pageParam = new PageParam(2,10);

        PageBean pageBean = userInfoService.listPage(pageParam, params);
        System.out.println("userInfos = " + JSON.toJSONString(pageBean));
    }

    @Test
    public void listBy() throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("email", "389235298@qq.com");
        List<UserInfo> userInfos = userInfoService.listBy(params);
        System.out.println("userInfos = " + JSON.toJSONString(userInfos));
    }


    @Test
    public void deleteById() throws Exception {
        int result = userInfoService.deleteById(519);
        System.out.println("result = " + result);
    }

    @Test
    public void update() throws Exception {
        UserInfo userInfo = userInfoService.getById(519);

        System.out.println("userInfo = " + JSON.toJSONString(userInfo));

        userInfo.setRealName("test1");

        int update = userInfoService.update(userInfo);

        System.out.println("update = " + update);
    }

    @Test
    public void insert() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("testUserName");
        userInfo.setCourseAdvisor("testCourseAdvisor");
        userInfo.setEmail("testEmail");
        userInfo.setPhone("test");
        userInfo.setRealName("test");
        userInfo.setUserId(19272);
        int result = userInfoService.insert(userInfo);
        System.out.println("result = " + result);
    }

    @Test
    public void getById() throws Exception {
        UserInfo userInfo = userInfoService.getById(1);
        System.out.println("userInfo = " + JSON.toJSONString(userInfo));
    }
}