package com.hand.order.client;

import com.hand.order.bean.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author Ashuang
 * @date 2018/10/18
 */

@FeignClient(name = "PRODUCT")
public interface ProductClient {
    /**
     *测试Feign
     * @return
     */
    @GetMapping("/msg")
    String getMsg();

    /**
     * 根据商品id获取商品信息
     * @param idList
     * @return
     */
    @PostMapping("/product/getProducts")
    List<ProductInfo> getProducts(@RequestBody List<String> idList);
}
