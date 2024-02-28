package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.core.enums.OrderStatusEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private OrderStatusEnum status;

    private List<Product> products = new ArrayList<>();

    private User user;

    public Order() {
        this.id = UUID.randomUUID();
        this.status = OrderStatusEnum.RECEBIDO;
    }
}
