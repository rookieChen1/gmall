package com.atguigu.gmall.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDubbo
@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall.user.mapper")
public class GmallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserApplication.class, args);
	}
}
