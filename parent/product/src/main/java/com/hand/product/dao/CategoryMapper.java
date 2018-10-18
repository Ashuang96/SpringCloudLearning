package com.hand.product.dao;


import com.hand.product.bean.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    /**
     * 获取所有商品类型
     * @return
     */
    List<Category> getAllCategoryByTypeList(@Param("typeList") List<Integer> typeList);

}