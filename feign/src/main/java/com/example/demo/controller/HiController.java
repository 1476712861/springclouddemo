package com.example.demo.controller;


import com.example.demo.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/5/1.
 */
@RestController
public class HiController {

    @Autowired
    ServiceHi serviceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceHi.sayHiFromClientOne( name ) + " feign";
    }

}
