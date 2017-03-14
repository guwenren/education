package com.siyuanren.education.common.util;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.common.util.ResourceUtils
 * Date         2017/3/14
 * Time         19:29
 * Description
 */
public class ResourceUtils implements Serializable {

    private ResourceBundle resourceBundle;

    private ResourceUtils(String baseName) {
        resourceBundle = ResourceBundle.getBundle(baseName);
    }

    public static ResourceUtils getResourceBundle(String resource) {
        return new ResourceUtils(resource);
    }

    public String getString(String key, Object... objects) {
        String format = resourceBundle.getString(key);
        return MessageFormat.format(format, objects);
    }

    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap();
        for (String key : resourceBundle.keySet()) {
            map.put(key, getString(key));
        }
        return map;
    }


    public static void main(String[] args) {
        ResourceUtils resourceUtils = ResourceUtils.getResourceBundle("public_user");

        String test1 = resourceUtils.getString("test1", "zhang", "zhaoqi");
        System.out.println("test1 = " + test1);

        Map<String, String> map = resourceUtils.getMap();
        System.out.println(map);
    }
}