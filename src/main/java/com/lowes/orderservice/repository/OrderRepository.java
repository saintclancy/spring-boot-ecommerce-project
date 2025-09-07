package com.lowes.orderservice.repository;

import com.lowes.orderservice.model.Order;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class OrderRepository {

    private final Map<String, Order> orderDb = new HashMap<>();

    public Order saveOrder(Order order) {
        orderDb.put(order.id(), order);
        return order;
    }

    public Optional<Order> findById(String id){
        return Optional.ofNullable(orderDb.get(id));
    }

    public List<Order> findAll(){
        return new ArrayList<>(orderDb.values());
    }
}
