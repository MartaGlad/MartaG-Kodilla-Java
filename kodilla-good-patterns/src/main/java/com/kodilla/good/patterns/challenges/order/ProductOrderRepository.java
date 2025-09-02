package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product, LocalDateTime orderDateTime) {
        System.out.println("\nOrder has been created in database.");

    }
}
