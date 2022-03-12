package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo.spring.*")
public class DemoMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMenuApplication.class, args);
	}

}
