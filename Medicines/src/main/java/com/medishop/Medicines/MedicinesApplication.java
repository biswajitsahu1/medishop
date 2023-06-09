package com.medishop.Medicines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MedicinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicinesApplication.class, args);
	}

}
