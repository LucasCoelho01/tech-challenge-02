package com.lucas.techchallenge.core.usecases;

import com.lucas.techchallenge.common.daos.OrderDao;
import com.lucas.techchallenge.common.daos.ProductDao;
import com.lucas.techchallenge.common.daos.UserDao;
import com.lucas.techchallenge.common.dtos.OrderDto;
import com.lucas.techchallenge.communication.gateways.OrderRepository;
import com.lucas.techchallenge.communication.gateways.ProductRepository;
import com.lucas.techchallenge.communication.gateways.UserRepository;
import com.lucas.techchallenge.core.entities.Order;
import com.lucas.techchallenge.core.entities.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class OrderUseCase {

    public Order createOrder(OrderDto orderDto,
                             OrderRepository orderRepository,
                             UserUseCase userUseCase,
                             UserRepository userRepository,
                             ProductUseCase productUseCase,
                             ProductRepository productRepository) throws Exception {
        Order order = new Order();

        Optional<UserDao> user = userUseCase.getUserById(orderDto.getUser_id(), userRepository);

        if (Objects.nonNull(user)) {
            order.setUsername(user.get().getUsername());
        }

        List<Product> productList = new ArrayList<>();

        List<BigDecimal> totalPrice = new ArrayList<>();

        orderDto.getProducts_ids().forEach(product_id -> {
            UUID productIdUUID = UUID.fromString(product_id);
            Product productFound = productUseCase.getById(productIdUUID, productRepository);

            totalPrice.add(productFound.getProductPrice());
            productList.add(productFound);
        });

        order.setProducts(productList);

        OrderDao orderCreated = orderRepository.save(new OrderDao(order));
        order.setPrice(orderCreated.getPrice());

        return order;
    }
}
