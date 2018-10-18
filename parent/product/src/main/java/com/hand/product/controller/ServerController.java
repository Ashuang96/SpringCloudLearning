package com.hand.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ashuang
 * @date 2018/10/18
 */

@RestController
public class ServerController {

    @RequestMapping("/msg")
    public String getMsg() {
        return "this is my message";
    }
}
