package com.redsocial.aplication.solicitudamistad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiSolicitudAmistadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSolicitudAmistadApplication.class, args);
	}

}
