package com.hand.order.controller;

import com.hand.order.dto.OrderDto;
import com.hand.order.service.OrderService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ashuang
 * @date 2018/10/17
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/createOrder")
    public OrderDto createOrder(@Valid OrderDto orderDto, BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> error = new HashMap<>(8);
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError f : errors) {
                error.put(f.getField(), f.getDefaultMessage());
            }
        }
        // todo
        return null;
    }
}
