package com.example.lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class TestController {
    @GetMapping("test")
    public String getText() {
        return "Hello World";
    }
}
