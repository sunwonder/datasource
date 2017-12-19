package com.jason.learning.datasource.config;

import com.jason.learning.datasource.annotation.RepositoryOne;
import com.jason.learning.datasource.annotation.RepositoryTwo;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2017-12-15 下午2:15
 **/
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MapperScannerConfig {


    /**
     * - 设置SqlSessionFactory；
     * - 设置dao所在的package路径；
     * - 关联注解在dao类上的Annotation名字；
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurerOne() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryOne");
        mapperScannerConfigurer.setBasePackage("com.jason.learning.datasource.mapper");
        mapperScannerConfigurer.setAnnotationClass(RepositoryOne.class);
        return mapperScannerConfigurer;
    }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurerTwo() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryTwo");
        mapperScannerConfigurer.setBasePackage("com.jason.learning.datasource.mapper");
        mapperScannerConfigurer.setAnnotationClass(RepositoryTwo.class);
        return mapperScannerConfigurer;
    }
}
