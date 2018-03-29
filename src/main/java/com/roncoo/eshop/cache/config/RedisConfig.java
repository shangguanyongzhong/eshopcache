package com.roncoo.eshop.cache.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * redis-config
 *
 * @auther sgyz
 * @create 2018/3/17 0017
 */
@Configuration
public class RedisConfig {
    @Bean
    public JedisCluster JedisClusterFactory() {
        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
        jedisClusterNodes.add(new HostAndPort("192.168.0.112", 7003));
        jedisClusterNodes.add(new HostAndPort("192.168.0.7", 7005));
        jedisClusterNodes.add(new HostAndPort("192.168.0.111", 7001));
        JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes);
        return jedisCluster;
    }

}
