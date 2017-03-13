package com.siyuanren.education.user.service;


import com.siyuanren.education.common.page.PageBean;
import com.siyuanren.education.common.page.PageParam;
import com.siyuanren.education.user.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.service.UserInfoService
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
public interface UserInfoService {

    /**
     * @param id
     * @return
     */
    UserInfo getById(int id);

    /**
     * @param userInfo
     * @return
     */
    int insert(UserInfo userInfo);

    /**
     * @param userInfo
     * @return
     */
    int update(UserInfo userInfo);

    /**
     *
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 列表
     * @param paramMap
     * @return
     */
    List<UserInfo> listBy(Map<String, Object> paramMap);

    /**
     * 分页
     * @param pageParam
     * @param paramMap
     * @return
     */
    PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);
}
