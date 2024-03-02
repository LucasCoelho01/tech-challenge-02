package com.lucas.techchallenge.external.apis;

import com.lucas.techchallenge.common.dtos.OrderDto;
import com.lucas.techchallenge.common.dtos.ProductDto;
import com.lucas.techchallenge.communication.controllers.OrderController;
import com.lucas.techchallenge.core.entities.Order;
import com.lucas.techchallenge.core.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderApi {

    @Autowired
    OrderController orderController;

    @PostMapping
    ResponseEntity<Order> createOder(@RequestBody OrderDto orderDto) throws Exception {
        return new ResponseEntity<>(orderController.createOrder(orderDto), HttpStatus.CREATED);
    }
}
