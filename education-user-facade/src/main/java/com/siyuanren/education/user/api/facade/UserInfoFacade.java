package com.siyuanren.education.user.api.facade;

import com.siyuanren.education.user.api.dto.UserInfoDTO;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.api.facade.UserInfoFacade
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
public interface UserInfoFacade {
    /**
     * 获取单个对象
     *
     * @param id
     * @return
     */
    UserInfoDTO getUserInfo(int id);
}
