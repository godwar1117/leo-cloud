package com.springcloud.leo.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring cloud 注册中心
 * Created by Leonid on 18/6/6.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCloudApplication.class, args);
    }
}
