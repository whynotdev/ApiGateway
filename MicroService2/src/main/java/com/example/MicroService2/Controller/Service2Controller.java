package com.example.MicroService2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
class Service2Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service 2!";
    }
}