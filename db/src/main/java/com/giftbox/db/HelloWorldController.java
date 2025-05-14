package com.giftbox.db;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello Benjamin";
    }
     @GetMapping(path = "/test")
    public String test(){
        return "N!GGGGGGG";
    }
}
