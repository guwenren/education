package com.siyuanren.education.common.web.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.common.web.annotation.Permission
 * Date         2017/3/14
 * Time         13:17
 * Description
 */
@Retention(RetentionPolicy.RUNTIME) //声明注解的保留期限
@Target(ElementType.METHOD) // 声明可以使用该注解的目标类型为在方法中使用
public @interface Permission {
    /** 权限值 */
    String value(); // 注解成员

}
