package com.chait.eureka.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.*;
import org.springframework.cloud.netflix.eureka.server.*;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigurationProperties
public class EurekaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistryApplication.class, args);
	}

}
