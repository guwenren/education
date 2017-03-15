package com.siyuanren.education.user.facade;

import com.siyuanren.education.user.api.dto.UserInfoDTO;
import com.siyuanren.education.user.api.exception.UserException;
import com.siyuanren.education.user.api.facade.UserInfoFacade;
import com.siyuanren.education.user.entity.UserInfo;
import com.siyuanren.education.user.service.UserInfoService;
import com.siyuanren.education.user.service.impl.UserInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.education.user.api.facade.UserInfoFacadeImpl
 * Date         2017/3/8
 * Time         17:14
 * Description
 */
@Repository
public class UserInfoFacadeImpl implements UserInfoFacade {

    private static Logger logger = LoggerFactory.getLogger(UserInfoFacadeImpl.class);
    @Autowired
    private UserInfoService userInfoService;

    @Override
    public UserInfoDTO getUserInfo(int id) {
        System.out.println("id = " + id);
        logger.info("getUserInfo");
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        UserInfo userInfo = userInfoService.getById(id);
        if(userInfo == null){
            throw UserException.USER_NOT_EXIST.print();
        }
        BeanUtils.copyProperties(userInfo, userInfoDTO);
        return userInfoDTO;
    }
}
