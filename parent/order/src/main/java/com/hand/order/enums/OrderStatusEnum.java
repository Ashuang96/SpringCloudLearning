package com.hand.order.enums;

import lombok.Getter;

/**
 * @author Ashuang
 * @date 2018/10/17
 */

@Getter
public enum OrderStatusEnum {

    NEW((byte)0, "新订单"),

    FINISHED((byte)1, "支付成功"),

    CANCEL((byte)2, "已取消");

    private Byte code;

    private String msg;

    OrderStatusEnum(Byte code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
