package com.example.uygulama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableCaching
@EnableJpaRepositories
public class UygulamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UygulamaApplication.class, args);
	}

}
