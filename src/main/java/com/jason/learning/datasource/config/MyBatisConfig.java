package com.jason.learning.datasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2017-12-15 下午1:40
 **/
@Configuration
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer {
    private final static Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);

    @Autowired
    DBProperties dBProperties;

    @Bean
    @Primary
    public DataSource dataSourceOne(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dBProperties.getDbone().getDriverClassName());
        dataSource.setUsername(dBProperties.getDbone().getUserName());
        dataSource.setPassword(dBProperties.getDbone().getPassword());
        dataSource.setUrl(dBProperties.getDbone().getJdbcUrl());
        dataSource.setInitialSize(dBProperties.getInitialSize());
        dataSource.setMinIdle(dBProperties.getMinIdle());
        dataSource.setMaxActive(dBProperties.getMaxActive());
        logger.info("DataSource-jdbcUrl:"+ dBProperties.getDbone().getJdbcUrl());
        // 启用监控统计功能
        try {
            dataSource.addFilters("stat,wall,log4j");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactoryOne() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSourceOne());
        try {
            return bean.getObject();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }



    @Bean
    public DataSource dataSourceTwo(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dBProperties.getDbtwo().getDriverClassName());
        dataSource.setUsername(dBProperties.getDbtwo().getUserName());
        dataSource.setPassword(dBProperties.getDbtwo().getPassword());
        dataSource.setUrl(dBProperties.getDbtwo().getJdbcUrl());
        dataSource.setInitialSize(dBProperties.getInitialSize());
        dataSource.setMinIdle(dBProperties.getMinIdle());
        dataSource.setMaxActive(dBProperties.getMaxActive());
        logger.info("DataSource-jdbcUrl:"+ dBProperties.getDbone().getJdbcUrl());
        // 启用监控统计功能
        try {
            dataSource.addFilters("stat,wall,log4j");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryTwo() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSourceTwo());
        try {
            return bean.getObject();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

        @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return null;
    }
}
