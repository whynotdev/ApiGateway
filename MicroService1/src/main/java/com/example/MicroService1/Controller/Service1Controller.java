package com.example.MicroService1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
class Service1Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service 1!";
    }
}