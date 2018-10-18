package com.hand.product.controller;

import com.hand.product.VO.ProductInfoVO;
import com.hand.product.VO.ProductVO;
import com.hand.product.VO.ResultVO;
import com.hand.product.bean.Category;
import com.hand.product.bean.ProductInfo;
import com.hand.product.service.CategoryService;
import com.hand.product.service.ProductService;
import com.hand.product.utils.ResultUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ZhengShuang
 * @date 2018/10/16 14:58
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @Resource
    private CategoryService categoryService;

    /**
     * 获取在架商品
     * @return
     */
    @GetMapping("/products")
    public ResultVO<ProductVO> getProduct() {
        // 获取所有在架商品
        List<ProductInfo> productInfoList = productService.findAllProduct();
        // 获取所有商品类型列表
        List<Integer> categoryTypeList = productInfoList.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        // 获取所有商品类型
        List<Category> categoryList = categoryService.getAllCategoryByTypeList(categoryTypeList);

        // 构造返回数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (Category category : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(category.getCategoryName());
            productVO.setCategoryType(category.getCategoryType());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(category.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultUtil.success(productVOList);
    }

    /**
     * 获取商品列表
     * @return
     */
    @PostMapping("/getProducts")
    public List<ProductInfo> getProductInfo(@RequestBody List<String> idList) {
        return productService.findProductByIdList(idList);
    }
}
