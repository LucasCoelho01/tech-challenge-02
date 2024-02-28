package com.lucas.techchallenge.common.dtos;

import java.util.List;
import java.util.UUID;

public class OrderDto {
    private List<String> products_ids;
    private UUID user_id;

    public List<String> getProducts_ids() {
        return products_ids;
    }

    public void setProducts_ids(List<String> products_ids) {
        this.products_ids = products_ids;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }
}
