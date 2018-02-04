package com.project.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.project")
public class ProjetoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoRestApplication.class, args);
	}
}
