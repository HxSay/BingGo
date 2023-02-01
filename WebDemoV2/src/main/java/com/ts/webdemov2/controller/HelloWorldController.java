package com.ts.webdemov2.controller;


import com.ts.domain.TestBean;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/webdemo")
public class HelloWorldController {

    @ResponseBody
    @PostMapping("/helloworld")
    @CrossOrigin
    public String helloWorld(){
        System.out.println("helloWorld");
        return "hello world!";
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping("/sendBlob1")
    public String sendBlob1(@RequestParam MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        return "sendBlob";
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping("/sendBlob2")
    public String sendBlob2(@RequestBody TestBean bean){
        return "sendBlob";
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping("/sendBlobBase64")
    public String sendBlobBase64(@RequestBody TestBean bean){
        System.out.println(bean.getStream());
        byte[] bytes = Base64.decodeBase64(bean.getStream());
        System.out.println(new String(bytes));
        return new String(bytes);
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping("/sendBlobbytes")
    public String sendBlobbytes(@RequestBody TestBean bean){
        return new String(bean.getStreamb());
    }

}
