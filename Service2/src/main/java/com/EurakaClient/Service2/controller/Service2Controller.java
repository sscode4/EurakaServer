package com.EurakaClient.Service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class Service2Controller {


    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Service2!";
    }
}
