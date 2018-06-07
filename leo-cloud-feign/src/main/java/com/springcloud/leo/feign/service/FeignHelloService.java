package com.springcloud.leo.feign.service;

import com.springcloud.leo.feign.service.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Leonid on 18/6/6.
 */
@FeignClient(value = "LEO-EUREKA-CLIENT",fallback = SchedualServiceHiHystric.class)
public interface FeignHelloService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
