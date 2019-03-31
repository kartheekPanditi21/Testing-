package com.slokam.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.slokam.first.stringutil.StringUtil;

@SpringBootApplication

//@EnableJpaRepositories({"com.slokam.first.dao"})
//@ComponentScan({"com.slokam.first.controller","com.slokam.first.service"})
//@EntityScan("com.slokam.first.pojo")
//confiurable(by default provided by springboot no need to provide

public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
	
	/*@Bean
	public StringUtil stringUtil(){
		return new StringUtil();
		
	}*/
}
