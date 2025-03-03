package com.basictodo.springboot.FirstSpringWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SayHelloController {

    @RequestMapping("/jsp")
    public String sayHellojsp(){
        return "sayHello";
    }

    // @RequestMapping("say-hello-html")
    // public String sayHellohtml(){
    //     return "hello ! html";
    // }
}
