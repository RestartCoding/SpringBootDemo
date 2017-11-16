package com.example.service.feign.controller;

import com.example.service.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(){
        return schedualServiceHi.sayHi();
    }
}
