package com.hand.product.enums;

import jdk.nashorn.internal.codegen.DumpBytecode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ZhengShuang
 * @date 2018/10/16 16:34
 */

@Getter
public enum ProductEnum {
    UP(1, "在架"),
    DOWN(0, "已下架");

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态
     */
    private String status;

    ProductEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

}
