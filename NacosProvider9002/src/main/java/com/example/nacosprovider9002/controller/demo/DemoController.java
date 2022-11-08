package com.example.nacosprovider9002.controller.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/get")
    String get(){
        return "Hello World!";
    }

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/tsinghualei")
    public String getServerPort(){
        return "Hello Nacos Discovery: "+serverPort;
    }

    @GetMapping( "/echo/{string}")
    public String echo(@PathVariable String string){
        return "Hello Nacos Discovery" + string;
    }
}
