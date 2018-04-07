//package com.roncoo.eshop.cache.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
///**
// * 后面构建config
// */
////@Configuration
////@EnableJpaRepositories(
////    basePackages = "com.i.commons.repository",
////    entityManagerFactoryRef = "EntityManager",
////    transactionManagerRef = "TransactionManager"
////)
//
//@Configuration
//@MapperScan("com.roncoo.eshop.cache.mapper")
//public class DataSourceConfig {
//
//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix="spring.datasource")
//    public org.apache.tomcat.jdbc.pool.DataSource dataSource() {
//        return new org.apache.tomcat.jdbc.pool.DataSource();
//    }
//
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    @Primary
//    public PlatformTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
//
//}
