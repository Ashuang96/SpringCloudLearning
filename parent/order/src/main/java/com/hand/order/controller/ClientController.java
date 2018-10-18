package com.hand.order.controller;

import com.hand.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ashuang
 * @date 2018/10/18
 */

@Slf4j
@RestController
public class ClientController {

    @Resource
    private ProductClient productClient;

    @GetMapping("/getMsg")
    public String getMsg() {
        // 1、使用RestTemplate(直接写死url)
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8080/msg", String.class);
        // 2、第二种方式（使用loadBalancerClient获取url）
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String host = serviceInstance.getHost();
//        String url = String.format("http://%s:%s", host, serviceInstance.getPort()) + "/msg";
//        RestTemplate restTemplate = new RestTemplate();
//        String response =  restTemplate.getForObject(url, String.class);
        // 3、第三种方式(利用RestBalanced注解, 可以在RestTemplate直接写应用名字)
//        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        String response = productClient.getMsg();
        return response;
    }

    @GetMapping("/getProducts")
    public String getProducts() {
        List<String> idList = new ArrayList<>();
        idList.add("157875196366160022");
        idList.add("157875227953464068");
        idList.add("164103465734242707");
        productClient.getProducts(idList);
        return "success";
    }
}
