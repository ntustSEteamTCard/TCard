package com.TCard.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//,scanBasePackages={"com.TCard.demo"}
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@EnableJpaRepositories ("com.TCard.demo.repository") // this fix the problem
public class TCardDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TCardDemoApplication.class, args);
	}

}