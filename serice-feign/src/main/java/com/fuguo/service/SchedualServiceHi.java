package com.fuguo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述: TODO
 *
 * @author 00938658-王富国
 * @date 2017-12-25 16:34
 * @since V1.0.0
 */
@FeignClient(value = "EUREKA-CLIENT")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
