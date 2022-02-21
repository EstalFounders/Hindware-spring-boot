package com.estal.Estal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EstalApplication {
	public static void main(String[] args) {
		SpringApplication.run(EstalApplication.class, args);
	}

}
