package com.example.eureka.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//声明这是一个Eureka Client
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.eureka.client2")
public class App {
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    }
}