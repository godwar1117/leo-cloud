package com.springcloud.leo.feign.service.fallback;

import com.springcloud.leo.feign.service.FeignHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Leonid on 18/6/6.
 */
@Component
public class SchedualServiceHiHystric implements FeignHelloService {


    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }

}
