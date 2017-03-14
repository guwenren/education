package com.siyuanren.education.common.web.handler;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.common.web.handler.WebHandlerExceptionResolver
 * Date         2017/3/14
 * Time         10:48
 * Description
 */
@Component
public class WebHandlerExceptionResolver implements HandlerExceptionResolver {

    private static Logger logger = LoggerFactory.getLogger(WebHandlerExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
            /*  使用FastJson提供的FastJsonJsonView视图返回，不需要捕获异常   */
        FastJsonJsonView view = new FastJsonJsonView();
        Map<String, Object> attributes = new HashMap<>();
        String message = e.getMessage();
        attributes.put("data", new Object[]{});
        attributes.put("message", message);
        attributes.put("code", 1);//result.setCode(1);
        view.setAttributesMap(attributes);
        mv.setView(view);
        logger.info("异常:" + message, e);
        return mv;
    }
}
