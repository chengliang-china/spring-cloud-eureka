package com.example.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 
 * @EnableEurekaServer
 * 用来指定该项目为Eureka的服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class App {
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    }
}
