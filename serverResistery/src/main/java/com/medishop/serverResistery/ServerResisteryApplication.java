package com.medishop.serverResistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerResisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerResisteryApplication.class, args);
	}
}
