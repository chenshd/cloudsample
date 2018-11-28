package com.loocloud.zdemo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZdemoEurekaServer {
	
	public static void main(String[] args) {
		SpringApplication.run(ZdemoEurekaServer.class, args);
	}
}
