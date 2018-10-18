package com.hand.order.enums;

import lombok.Getter;

/**
 * @author Ashuang
 * @date 2018/10/17
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),

    FINISHED(1, "已支付"),

    CANCEL(2, "已取消");

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
