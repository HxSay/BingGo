package com.ts.controller;

import com.ts.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("/demo")
    @ResponseBody
    public String demo(){
        return demoService.demo();
    }
}
