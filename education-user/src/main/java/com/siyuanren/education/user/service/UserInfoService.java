package com.siyuanren.education.user.service;


import com.siyuanren.education.user.entity.UserInfo;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.service.UserInfoService
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
public interface UserInfoService  {

    /**
     *
     * @param id
     * @return
     */
    UserInfo getById(int id);
}
