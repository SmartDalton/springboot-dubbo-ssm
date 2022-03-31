package com.dalton;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.dalton.mapper")
@SpringBootApplication
public class Ch06SpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch06SpringbootMybatisApplication.class, args);
	}

}
