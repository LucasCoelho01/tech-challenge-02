package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.common.dtos.ProductDto;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private BigDecimal productPrice;

    public Product(ProductDto productDto) {
        this.productName = productDto.getProductName();
        this.productPrice = productDto.getProductPrice();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
}
