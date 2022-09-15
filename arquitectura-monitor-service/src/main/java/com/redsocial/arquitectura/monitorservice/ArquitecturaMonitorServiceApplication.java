package com.redsocial.arquitectura.monitorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class ArquitecturaMonitorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquitecturaMonitorServiceApplication.class, args);
	}

}
