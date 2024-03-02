package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.core.enums.OrderStatusEnum;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private String username;
    private List<Product> products = new ArrayList<>();
    private int sequence;
    private OrderStatusEnum status;
    private BigDecimal price;

    public Order() {
        this.id = UUID.randomUUID();
        this.status = OrderStatusEnum.RECEBIDO;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrderStatusEnum status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
