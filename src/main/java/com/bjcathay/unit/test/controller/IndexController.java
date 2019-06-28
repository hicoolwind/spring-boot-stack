package com.bjcathay.unit.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujunliang
 * @date 2019/6/27
 */
@RestController
public class IndexController {

    @GetMapping()
    public String index(){
        return "Hello";
    }
}
