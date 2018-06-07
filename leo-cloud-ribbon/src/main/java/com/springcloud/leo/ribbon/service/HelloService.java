package com.springcloud.leo.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Leonid on 18/6/6.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://LEO-EUREKA-CLIENT/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry ,service is down";
    }

}
