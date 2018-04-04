package com.fuguo.controller;

import com.fuguo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述: TODO
 *
 * @author 00938658-王富国
 * @date 2017-12-25 16:07
 * @since V1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    @Scheduled
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
