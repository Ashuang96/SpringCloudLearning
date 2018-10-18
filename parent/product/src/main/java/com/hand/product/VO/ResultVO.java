package com.hand.product.VO;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ZhengShuang
 * @date 2018/10/16 17:19
 */

@Getter
@Setter
public class ResultVO<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回内容(泛型)
     */
    private T data;


}
