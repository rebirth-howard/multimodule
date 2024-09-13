package com.be.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (
		scanBasePackages = { "com.be.moduleapi", "com.be.modulecommon"}
)
@EntityScan("com.be.modulecommon.domain")
@EnableJpaRepositories(basePackages = "com.be.modulecommon.repositories")
public class ModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
