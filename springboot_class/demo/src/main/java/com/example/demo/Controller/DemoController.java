package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello World 1";
    }
}