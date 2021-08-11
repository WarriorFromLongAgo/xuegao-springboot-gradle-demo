package com.xuegao.gradledemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/> @ClassName：HelloController
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2021/8/11 19:00
 */
@RestController
public class HelloController {

    @GetMapping(path = "/hello/get1")
    public String hello() {
        return "hello world";
    }
}