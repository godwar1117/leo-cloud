package com.springcloud.leo.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Leonid on 18/6/6.
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCloudApplication.class, args);
    }
}
