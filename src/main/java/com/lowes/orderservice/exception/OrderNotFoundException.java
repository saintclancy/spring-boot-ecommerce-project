package com.lowes.orderservice.exception;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String id) {
        super("Order with ID: " + id + " not found");
    }
}
