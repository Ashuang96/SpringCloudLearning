package com.hand.order.service;

import com.hand.order.dto.OrderDto;

/**
 * @author Ashuang
 * @date 2018/10/17
 */

public interface OrderService {

    /**
     * 创建订单
     * @param orderDto
     * @return
     */
    OrderDto create(OrderDto orderDto);
}
