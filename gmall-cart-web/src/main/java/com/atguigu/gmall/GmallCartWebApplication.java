package com.atguigu.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class GmallCartWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallCartWebApplication.class, args);
	}
}
