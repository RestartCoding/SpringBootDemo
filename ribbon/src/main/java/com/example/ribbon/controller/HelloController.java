package com.example.ribbon.controller;

import com.example.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String hi(){
        return helloService.hiService();
    }
}
