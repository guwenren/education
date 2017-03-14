package com.siyuanren.education.user.dao;

import com.siyuanren.education.common.dao.BaseDao;
import com.siyuanren.education.user.entity.UserStudent;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.dao.UserStudentDAO
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
public interface UserStudentDAO extends BaseDao<UserStudent> {
    /**
     * 根据手机号码获取用户
     *
     * @param mobile
     * @return
     */
    UserStudent getUserStudentByMobile(String mobile);

    /**
     * 根据用户名获取用户
     *
     * @param userName
     * @return
     */
    UserStudent getUserStudentByUserName(String userName);
}
