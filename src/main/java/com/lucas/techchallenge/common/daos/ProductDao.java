package com.lucas.techchallenge.common.daos;

import com.lucas.techchallenge.common.dtos.ProductDto;
import com.lucas.techchallenge.core.entities.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "products")
public class ProductDao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private BigDecimal productPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryDao category;

    public ProductDao(Product product) {
        this.productName = product.getProductName();
        this.productPrice = product.getProductPrice();
    }
}