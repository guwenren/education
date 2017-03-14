package com.siyuanren.education.api.controller.user;

import com.alibaba.fastjson.JSON;
import com.siyuanren.education.common.web.bean.Result;
import com.siyuanren.education.common.web.controller.BaseController;
import com.siyuanren.education.user.api.dto.UserInfoDTO;
import com.siyuanren.education.user.api.facade.UserInfoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.api.controller.user.UserController
 * Date         2017/3/13
 * Time         18:52
 * Description
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {
    @Autowired
    private UserInfoFacade userInfoFacade;

    @RequestMapping(value = "index")
    @ResponseBody
    public Result index(@RequestParam(value = "id", defaultValue = "1") int id) {
        Result result = new Result();
        UserInfoDTO userInfoDTO = userInfoFacade.getUserInfo(id);
        System.out.println("userInfoDTO = " + JSON.toJSONString(userInfoDTO));
        return result;
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public Result list() {
        Result result = new Result();
        UserInfoDTO userInfoDTO = userInfoFacade.getUserInfo(515);
        System.out.println("result.list = " + result);
        result.setData(userInfoDTO);
        return result;
    }
}
