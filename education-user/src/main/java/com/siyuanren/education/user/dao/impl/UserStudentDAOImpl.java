package com.siyuanren.education.user.dao.impl;

import com.siyuanren.education.common.dao.BaseDaoImpl;
import com.siyuanren.education.user.dao.UserStudentDAO;
import com.siyuanren.education.user.entity.UserStudent;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.dao.impl.UserStudentDAOImpl
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
@Repository
public class UserStudentDAOImpl extends BaseDaoImpl<UserStudent> implements UserStudentDAO {

    @Override
    public UserStudent getUserStudentByMobile(String mobile) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("mobile", mobile);
        String sqlId = "getUserStudentByMobile";
        return (UserStudent) super.getBy(paramMap, sqlId);
    }

    @Override
    public UserStudent getUserStudentByUserName(String userName) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userName", userName);
        String sqlId = "getUserStudentByUserName";
        return (UserStudent) super.getBy(paramMap, sqlId);
    }
}
