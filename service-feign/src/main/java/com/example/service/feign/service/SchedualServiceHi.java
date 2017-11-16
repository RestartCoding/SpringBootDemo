package com.example.service.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-ribbon")
public interface SchedualServiceHi {
        @GetMapping("/hi")
        String sayHi();
}
