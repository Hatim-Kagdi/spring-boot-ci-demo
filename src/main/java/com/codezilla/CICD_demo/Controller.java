package com.codezilla.CICD_demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/demo")
    public String sayHello(){
        return "Hello from pipeline!";
    }
}
