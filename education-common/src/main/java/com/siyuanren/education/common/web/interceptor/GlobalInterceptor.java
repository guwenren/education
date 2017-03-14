package com.siyuanren.education.common.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.common.web.interceptor.GlobalInterceptor
 * Date         2017/3/14
 * Time         13:30
 * Description
 */
public class GlobalInterceptor implements HandlerInterceptor {

    private static Logger logger = LoggerFactory.getLogger(GlobalInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("GlobalInterceptor.preHandle..");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("GlobalInterceptor.postHandle..");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("GlobalInterceptor.afterCompletion..");
    }
}
