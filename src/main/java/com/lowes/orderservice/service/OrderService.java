package com.lowes.orderservice.service;

import com.lowes.orderservice.model.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    private final Map<String, Order> orderDb = new HashMap<>();

    public Order createOrder(List<String> skus) {
        Order order = new Order(UUID.randomUUID().toString(), skus);
        orderDb.put(order.id(), order);
        return order;
    }

    public Order getOrder(String id) {
        return orderDb.get(id);
    }

    public List<Order> getAllOrders(){
        return new ArrayList<>(orderDb.values());
    }
}