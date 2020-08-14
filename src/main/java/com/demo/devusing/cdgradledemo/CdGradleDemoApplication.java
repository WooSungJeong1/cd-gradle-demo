package com.demo.devusing.cdgradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
//@EnableWebSecurity
public class CdGradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdGradleDemoApplication.class, args);
	}

}
