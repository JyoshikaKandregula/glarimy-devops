package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoServer {
    @GetMapping("/echo/{name}")
    public String echo(@PathVariable("name")String name){
        return "Hello " + name"! Welcome to DevOps.\n";
    }
}