package com.neothedeveloper.back_foodordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.neothedeveloper.back_foodordering")
public class BackFoodOrderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackFoodOrderingApplication.class, args);
	}

}
