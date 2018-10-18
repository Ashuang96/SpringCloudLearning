package com.hand.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author ZhengShuang
 * @date 2018/10/16 17:24
 */

@Data
public class ProductVO {
    /**
     * 类别
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * 类型
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 食品
     */
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
