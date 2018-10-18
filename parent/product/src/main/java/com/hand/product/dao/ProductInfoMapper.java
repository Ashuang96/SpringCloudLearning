package com.hand.product.dao;


import com.hand.product.bean.ProductInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductInfoMapper {
    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);

    List<ProductInfo> findProductByStatus(int status);

    List<ProductInfo> findProduct(@Param("productIdList") List<String> productIdList);
}