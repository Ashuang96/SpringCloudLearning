package com.hand.product.service.impl;

import com.hand.product.bean.Category;
import com.hand.product.dao.CategoryMapper;
import com.hand.product.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhengShuang
 * @date 2018/10/16 18:53
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> getAllCategoryByTypeList(List<Integer> typeList) {
        return categoryMapper.getAllCategoryByTypeList(typeList);
    }

}
