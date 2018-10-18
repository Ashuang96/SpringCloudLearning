package com.hand.order.dto;

import com.hand.order.bean.OrderDetail;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Ashuang
 * @date 2018/10/17
 */

@Data
public class OrderDto {

    /**
     * 订单id
     */
    private String orderId;
    /**
     * 买家姓名
     */
    @NotNull
    private String buyerName;

    /**
     * 买家电话
     */
    @Size(min = 11, max = 11, message = "电话号码必须为11位数字")
    private String buyerPhone;

    /**
     * 买家地址
     */
    @NotEmpty(message = "需要填写地址")
    private String buyerAddress;

    /**
     * 订单号
     */

    private String buyerOpenid;

    /**
     * 订单总价
     */
    @NotNull(message = "商品总价不能为空")
    private BigDecimal orderAmount;

    /**
     * 订单状态
     */
    @NotNull(message = "订单状态不能为空")
    private Byte orderStatus;

    /**
     * 支付状态
     */
    private Byte payStatus;

    /**
     * 订单列表详情
     */
    @NotNull
    private List<OrderDetail> detailList;
}
