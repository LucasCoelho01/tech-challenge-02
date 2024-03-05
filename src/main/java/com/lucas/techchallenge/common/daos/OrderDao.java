package com.lucas.techchallenge.common.daos;

import com.lucas.techchallenge.core.entities.Order;
import com.lucas.techchallenge.core.entities.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "orders")
public class OrderDao {
    @Id
    private UUID id;

    private String username;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="order_products", joinColumns=
            {@JoinColumn(name="order_id")}, inverseJoinColumns=
            {@JoinColumn(name="product_id")})
    private List<ProductDao> products;

    private String status;

    private BigDecimal price;

    private Timestamp createdTimestamp;

    public OrderDao() {}

    public OrderDao(Order order) {
        this.id = order.getId();
        this.username = order.getUsername();
        this.status = order.getStatus().toString();
        this.products = getProductsDao(order.getProducts());
        this.price = calculatePrice(order.getProducts());
        this.createdTimestamp = new Timestamp(System.currentTimeMillis());
    }

    private BigDecimal calculatePrice(List<Product> products) {
        List<BigDecimal> prices = new ArrayList<>();

        products.forEach(product -> {
            prices.add(product.getProductPrice());
        });

        BigDecimal totalPrice = BigDecimal.ZERO;

        totalPrice = prices.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        return totalPrice;
    }

    private List<ProductDao> getProductsDao(List<Product> products) {
        List<ProductDao> productDaos = new ArrayList<>();

        products.forEach(product -> {
            productDaos.add(new ProductDao(product));
        });

        return productDaos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<ProductDao> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDao> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}
