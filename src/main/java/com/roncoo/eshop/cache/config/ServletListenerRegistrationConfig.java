package com.roncoo.eshop.cache.config;

import com.roncoo.eshop.cache.listener.InitListener;
import org.springframework.boot.context.embedded.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化上下文
 *
 * @auther sgyz
 * @create 2018/4/7 0007
 */
@Configuration
public class ServletListenerRegistrationConfig {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean servletListenerRegistrationBean =
                new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new InitListener());
        return servletListenerRegistrationBean;
    }


}
