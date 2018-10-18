package com.hand.product.service.impl;

import com.hand.product.bean.ProductInfo;
import com.hand.product.dao.ProductInfoMapper;
import com.hand.product.enums.ProductEnum;
import com.hand.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhengShuang
 * @date 2018/10/16 16:33
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> findAllProduct() {
        return productInfoMapper.findProductByStatus(ProductEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findProductByIdList(List<String> idList) {
        return productInfoMapper.findProduct(idList);
    }
}
