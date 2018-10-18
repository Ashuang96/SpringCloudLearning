package com.hand.product;

import com.hand.product.bean.ProductInfo;
import com.hand.product.controller.ProductController;
import com.hand.product.dao.ProductInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Resource
    private ProductInfoMapper productInfoMapper;

    @Resource
    private ProductController productController;

    /**
     * 测试根据id获取商品信息
     */
    @Test
    public void contextLoads() {
        List<String> idList = new ArrayList<>();
        idList.add("157875196366160022");
        idList.add("157875227953464068");
        idList.add("164103465734242707");
        List<ProductInfo> productInfos = productInfoMapper.findProduct(idList);
    }

    @Test
    public void testGetProductInfo() {
        List<String> idList = new ArrayList<>();
        idList.add("157875196366160022");
        idList.add("157875227953464068");
        idList.add("164103465734242707");
        productController.getProductInfo(idList).stream().forEach(productInfo -> System.out.println(productInfo.getProductName()));
    }
}
