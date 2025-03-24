package com.example.azurespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AzureSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureSpringBootAppApplication.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Azure App Service???";
    }
}