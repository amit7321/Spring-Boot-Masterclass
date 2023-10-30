package com.example.springbootmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootMasterclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMasterclassApplication.class, args);
	}

}
