package com.springbootb6r3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.springbootb6r3.*")
public class SpringbootB6r3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootB6r3Application.class, args);
	}

}
