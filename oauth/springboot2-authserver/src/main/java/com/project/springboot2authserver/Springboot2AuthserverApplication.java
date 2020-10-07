package com.project.springboot2authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="*.*")
public class Springboot2AuthserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2AuthserverApplication.class, args);
	}

}
