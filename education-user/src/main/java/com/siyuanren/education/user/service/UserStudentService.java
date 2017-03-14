package com.siyuanren.education.user.service;


import com.siyuanren.education.common.page.PageBean;
import com.siyuanren.education.common.page.PageParam;
import com.siyuanren.education.user.api.vo.UserStudentVO;
import com.siyuanren.education.user.entity.UserStudent;

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
public interface UserStudentService {

    /**
     * @param id
     * @return
     */
    UserStudent getById(int id);

    /**
     * @param userInfo
     * @return
     */
    long insert(UserStudent userInfo);

    /**
     * @param userInfo
     * @return
     */
    int update(UserStudent userInfo);

    /**
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 列表
     *
     * @param paramMap
     * @return
     */
    List<UserStudent> listBy(Map<String, Object> paramMap);

    /**
     * 分页
     *
     * @param pageParam
     * @param paramMap
     * @return
     */
    PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);


    /**
     * 用户注册
     *
     * @param userStudentVO
     */
    void register(UserStudentVO userStudentVO);

    /**
     * 用户登录
     *
     * @param userStudentVO
     */
    void login(UserStudentVO userStudentVO);
}
