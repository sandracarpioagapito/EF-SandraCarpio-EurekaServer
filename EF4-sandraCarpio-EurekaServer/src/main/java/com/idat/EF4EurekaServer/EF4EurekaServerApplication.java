package com.idat.EF4EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EF4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EF4EurekaServerApplication.class, args);
	}

}
