package com.atguigu.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/hello")
public class HelloController {

    @Reference
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name){
        return helloService.sayHello(name);
    }


    public String hello(){
        System.out.println("master在后头之后再次修复");
        return "hot第一次修改";
    }
}

