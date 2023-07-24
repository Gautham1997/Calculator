package com.calculator.Calcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.calculator.Calccontroller")
public class CalcdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcdemoApplication.class, args);
	}

}
