package com.siyuanren.education.user.service.impl;


import com.siyuanren.education.user.dao.UserInfoDAO;
import com.siyuanren.education.user.entity.UserInfo;
import com.siyuanren.education.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.service.impl.UserInfoServiceImpl
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    public UserInfo getById(int id) {
        return userInfoDAO.getById(id);
    }
}
