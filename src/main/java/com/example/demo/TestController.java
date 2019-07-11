package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cl on 2019-7-4.
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public void test(){
        System.out.println("bwtc-this is a test!!!😀");
    }
}
