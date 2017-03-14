package com.siyuanren.education.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.user.DubboProviderUser
 * Date         2017/3/14
 * Time         9:46
 * Description
 */
public class DubboProviderUser {
    private static Logger logger = LoggerFactory.getLogger(DubboProviderUser.class);

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
            logger.info("education-user");
            logger.info("context = " + context);
            context.start();
        } catch (Exception e) {
            logger.error("== DubboProviderUser context start error:", e);
        }

        synchronized (DubboProviderUser.class) {
            while (true) {
                try {
                    DubboProviderUser.class.wait();
                } catch (InterruptedException e) {
                    logger.error("== synchronized error:", e);
                }
            }
        }
    }
}
