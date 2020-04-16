package com.york.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.york.**.mapper")
public class Provider_one_8002 {	
public static void main(String[] args) {
	SpringApplication.run(Provider_one_8002.class, args);
}
}
