package com.xiyan.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peng.wang
 */
@RestController
public class HelloController {

    @GetMapping("/getHello")
    public String getHello(){
        return "hello from nacos provider!";
    }

}
