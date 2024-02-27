package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.common.dtos.CategoryDto;

import java.util.UUID;

public class Category {
    private UUID id;
    private String categoryName;

    public Category(CategoryDto categoryDto) {
        this.id = UUID.randomUUID();
        this.categoryName = categoryDto.getCategoryName();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
