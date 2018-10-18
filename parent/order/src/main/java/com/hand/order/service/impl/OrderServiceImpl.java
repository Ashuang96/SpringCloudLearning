package com.hand.order.service.impl;

import com.hand.order.bean.OrderMaster;
import com.hand.order.dao.OrderDetailMapper;
import com.hand.order.dao.OrderMasterMapper;
import com.hand.order.dto.OrderDto;
import com.hand.order.enums.OrderStatusEnum;
import com.hand.order.service.OrderService;
import com.hand.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Ashuang
 * @date 2018/10/17
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMasterMapper orderMasterMapper;

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Override
    public OrderDto create(OrderDto orderDto) {

        // todo 查询商品信息
        // todo 计算总价
        // todo 减少库存
        // 订单入库
        OrderMaster orderMaster = new OrderMaster();
        BeanUtils.copyProperties(orderDto, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal("5"));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setOrderId(KeyUtil.getKeys());
        orderMasterMapper.insert(orderMaster);
        return orderDto;
    }
}
