package com.roncoo.eshop.cache.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * util包
 *
 * @auther sgyz
 * @create 2018/4/15 0015
 */
@Configuration
public class UtilConfig {

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
