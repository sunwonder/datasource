package com.jason.learning.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.jason.learning.datasource.mapper")  //扫描Mapper接口
public class DatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatasourceApplication.class, args);
	}
}
