package com.malexj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootHerokuConfigAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerokuConfigAppApplication.class, args);
	}

}