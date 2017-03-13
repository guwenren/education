package com.siyuanren.education.user.service.impl;


import com.alibaba.fastjson.JSON;
import com.siyuanren.education.common.page.PageBean;
import com.siyuanren.education.common.page.PageParam;
import com.siyuanren.education.user.dao.UserInfoDAO;
import com.siyuanren.education.user.entity.UserInfo;
import com.siyuanren.education.user.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    private static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public UserInfo getById(int id) {
        logger.info("id = " + id);
        return userInfoDAO.getById(id);
    }

    @Override
    public int insert(UserInfo userInfo) {
        logger.info("userInfo = " + JSON.toJSONString(userInfo));
        int result = userInfoDAO.insert(userInfo);
        return result;
    }

    @Override
    public int update(UserInfo userInfo) {
        logger.info("userInfo = " + JSON.toJSONString(userInfo));
        int result = userInfoDAO.update(userInfo);
        return result;
    }

    @Override
    public int deleteById(int id) {
        logger.info("id = " + id);
        int result = userInfoDAO.deleteById(id);
        return result;
    }

    @Override
    public List<UserInfo> listBy(Map<String, Object> paramMap) {
        logger.info("paramMap = " + paramMap);
        List<UserInfo> userInfos = userInfoDAO.listBy(paramMap);
        return userInfos;
    }

    @Override
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
        logger.info("pageParam = [" + JSON.toJSONString(pageParam) + "], paramMap = [" + paramMap + "]");
        return userInfoDAO.listPage(pageParam,paramMap);
    }
}
