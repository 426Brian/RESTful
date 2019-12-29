package com.restful.restfuldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.restful.restfuldemo.mapper")
public class RestfulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulDemoApplication.class, args);
	}

}

