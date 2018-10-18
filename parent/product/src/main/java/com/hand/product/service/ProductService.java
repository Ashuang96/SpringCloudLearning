package com.hand.product.service;

import com.hand.product.bean.ProductInfo;

import java.util.List;

/**
 * @author ZhengShuang
 * @date 2018/10/16 16:32
 */

public interface ProductService {
    /**
     * 查询在架商品
     * @return
     */
    List<ProductInfo> findAllProduct();

    List<ProductInfo> findProductByIdList(List<String> idList);

}
