package com.lucas.techchallenge.core.usecases;

import com.lucas.techchallenge.common.daos.ProductDao;
import com.lucas.techchallenge.common.dtos.ProductDto;
import com.lucas.techchallenge.communication.gateways.ProductRepository;
import com.lucas.techchallenge.core.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductUseCase {
    public Product createProduct(ProductDto productDto, ProductRepository productRepository) throws Exception {
        Product product = new Product(productDto);

        productRepository.save(new ProductDao(product));

        return product;
    }

    public List<Product> getAllProducts(ProductRepository productRepository) {
        List<ProductDao> productsDao = productRepository.findAll();
        List<Product> products = new ArrayList<>();

        productsDao.forEach(productDao -> {
            try {
                Product product = new Product(productDao);
                products.add(product);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        return products;
    }
}
