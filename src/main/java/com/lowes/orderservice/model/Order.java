package com.lowes.orderservice.model;

import java.util.List;

public record Order(String id, List<String> items){
}
