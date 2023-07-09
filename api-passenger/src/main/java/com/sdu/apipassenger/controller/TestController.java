package com.sdu.apipassenger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LHP
 * @date 2023-07-10 0:58
 * @description
 */

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test api passenger";
    }
}
