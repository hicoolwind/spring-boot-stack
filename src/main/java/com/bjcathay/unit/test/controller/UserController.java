package com.bjcathay.unit.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @GetMapping("count")
    public Integer getUserCount(){
        return 0;
    }
}
