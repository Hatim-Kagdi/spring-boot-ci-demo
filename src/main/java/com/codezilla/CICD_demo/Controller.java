package com.codezilla.CICD_demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/demo")
    public String sayHello(){
        return "Pipeline is working!";
    }

    @GetMapping("/new")
    public String working(){
        return "Page 2 Pipeline";
    }
}
