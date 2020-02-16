package com.ricky.mission2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ricky.mission2")
@EntityScan("com.ricky.mission2")
@SpringBootApplication
public class Mission2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mission2Application.class, args);
	}

}
