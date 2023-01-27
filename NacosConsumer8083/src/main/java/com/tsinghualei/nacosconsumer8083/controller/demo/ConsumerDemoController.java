package com.tsinghualei.nacosconsumer8083.controller.demo;

import com.tsinghualei.nacosconsumer8083.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerDemoController {
    @Autowired   //按照名字注入bean
    private RestTemplate restTemplate; //传统情况下在java代码里访问restful服务，一般使用Apache的HttpClient。不过此种方法使用起来太过繁琐。spring提供了一种简单便捷的模板类来进行操作，这就是RestTemplate。

    @Autowired  //按照type注入bean
    private LoadBalancerClient loadBalancedClient;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private AopService aopService;

    @GetMapping( "/nacos")
    public String getDiscovery(){
        System.err.println(serverURL);
        return restTemplate.getForObject(serverURL+"/tsinghualei",String.class);
    }

    @GetMapping("/echo/app-name")
    public String echoAppName(){
        ServiceInstance serviceInstance = loadBalancedClient.choose("nacos-provider");
        String path = String.format("http://%s:%s/echo/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        System.out.println("request path:" +path);
        return restTemplate.getForObject(path,String.class);
    }

    @GetMapping("/aopTest")
    public String aopTest(){
        Long[] ids = new Long[10];
        for(long i=0;i<10;++i){
            ids[(int) i]=i;
        }
        aopService.aopTest(ids);
        return "aopTest";
    }

}
