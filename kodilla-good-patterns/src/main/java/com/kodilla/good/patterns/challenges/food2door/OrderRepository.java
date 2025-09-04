package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public interface OrderRepository {

    void createOrder(Customer customer, Provider provider,
                     Product product, int quantity, LocalDateTime orderDateTime);
}
