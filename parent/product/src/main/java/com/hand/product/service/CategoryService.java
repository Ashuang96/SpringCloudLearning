package com.hand.product.service;

import com.hand.product.bean.Category;

import java.util.List;

/**
 * @author ZhengShuang
 * @date 2018/10/16 18:52
 */

public interface CategoryService {
    /**
     * 获取有效商品类型
     * @param typeList
     * @return
     */
    List<Category> getAllCategoryByTypeList(List<Integer> typeList);
}
