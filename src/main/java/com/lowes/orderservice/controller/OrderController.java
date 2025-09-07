package com.lowes.orderservice.controller;

import com.lowes.orderservice.model.Order;
import com.lowes.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody List<String> skus){
        return orderService.createOrder(skus);
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable String id) {
        return orderService.getOrder(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

}
