package com.roncoo.eshop.cache.spring;


import org.springframework.context.ApplicationContext;

/**
 * spring上下文
 *
 * @auther sgyz
 * @create 2018/4/7 0007
 */
public class SpringContext {
    private  static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        SpringContext.applicationContext = applicationContext;
    }
}
