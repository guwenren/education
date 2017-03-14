package com.siyuanren.education.api.controller;

import com.siyuanren.education.common.web.bean.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.api.controller.IndexController
 * Date         2017/3/13
 * Time         19:08
 * Description
 */
@Controller
@RequestMapping
public class IndexController {


    /**
     * 进入首页
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    @ResponseBody
    public Result index() {
        Result result = new Result();
        return result;
    }
}
