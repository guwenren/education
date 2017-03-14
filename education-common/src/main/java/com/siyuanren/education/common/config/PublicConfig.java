package com.siyuanren.education.common.config;

import com.siyuanren.education.common.util.ResourceUtils;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.common.config.PublicConfig
 * Date         2017/3/14
 * Time         19:28
 * Description
 */
public class PublicConfig implements Serializable{
    /**
     * 系统文件配置 加载。
     */
    public static Map<String, String> PUBLIC_USER = ResourceUtils.getResourceBundle("public_user").getMap();
    public static Map<String, String> PUBLIC_SYSTEM = ResourceUtils.getResourceBundle("public_system").getMap();

    public final static boolean IS_DEV_STATUS = Boolean.parseBoolean(PUBLIC_USER.get("IS_DEV_STATUS"));

    public final static Integer MESSAGE_HANDLE_DURATION = Integer.parseInt(PUBLIC_SYSTEM.get("message.handle.duration"));

    public final static Integer MESSAGE_MAX_SEND_TIMES = Integer.parseInt(PUBLIC_SYSTEM.get("message.max.send.times"));

    public static void main(String[] args) {
        System.out.println(IS_DEV_STATUS);
        System.out.println("MESSAGE_HANDLE_DURATION = " + MESSAGE_HANDLE_DURATION);
        System.out.println("MESSAGE_MAX_SEND_TIMES = " + MESSAGE_MAX_SEND_TIMES);
    }
}
