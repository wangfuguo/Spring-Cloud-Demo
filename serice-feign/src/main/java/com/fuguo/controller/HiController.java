package com.fuguo.controller;

import com.fuguo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述: TODO
 *
 * @author 00938658-王富国
 * @date 2017-12-25 16:36
 * @since V1.0.0
 */
@RestController
public class HiController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
