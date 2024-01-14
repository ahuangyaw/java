package com.example.demo.controller;

import com.example.demo.until.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : hwang
 * date : 2024/1/10 21:35
 * description : HelloController
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Result hello(){
        return Result.success("hello");
    }

}
