package com.siyuanren.education.user.service.impl;


import com.siyuanren.education.common.page.PageBean;
import com.siyuanren.education.common.page.PageParam;
import com.siyuanren.education.user.api.vo.UserStudentVO;
import com.siyuanren.education.user.dao.UserStudentDAO;
import com.siyuanren.education.user.entity.UserStudent;
import com.siyuanren.education.user.service.UserStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.service.impl.UserStudentServiceImpl
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
@Service
public class UserStudentServiceImpl implements UserStudentService {

    private static Logger logger = LoggerFactory.getLogger(UserStudentServiceImpl.class);
    @Autowired
    private UserStudentDAO userStudentDAO;

    @Override
    public UserStudent getById(int id) {
        return userStudentDAO.getById(id);
    }

    @Override
    public long insert(UserStudent userStudent) {
        long result = userStudentDAO.insert(userStudent);
        return result;
    }

    @Override
    public int update(UserStudent userStudent) {
        int result = userStudentDAO.update(userStudent);
        return result;
    }

    @Override
    public int deleteById(int id) {
        int result = userStudentDAO.deleteById(id);
        return result;
    }

    @Override
    public List<UserStudent> listBy(Map<String, Object> paramMap) {
        List<UserStudent> userStudents = userStudentDAO.listBy(paramMap);
        return userStudents;
    }

    @Override
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
        return userStudentDAO.listPage(pageParam, paramMap);
    }

    @Override
    public void register(UserStudentVO userStudentVO) {

    }

    @Override
    public void login(UserStudentVO userStudentVO) {

    }
}
