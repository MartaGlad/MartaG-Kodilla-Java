package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class DatabaseOrderRepository implements OrderRepository {

    @Override
    public void createOrder(Customer customer, Provider provider,
                            Product product, int quantity, LocalDateTime orderDateTime) {

        System.out.println("\nOrder has been created in database.");

    }
}

