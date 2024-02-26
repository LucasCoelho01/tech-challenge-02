package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.common.dtos.CategoryDto;

public class Category {
    private String categoryName;

    public Category(CategoryDto categoryDto) {
        this.categoryName = categoryDto.getCategoryName();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
