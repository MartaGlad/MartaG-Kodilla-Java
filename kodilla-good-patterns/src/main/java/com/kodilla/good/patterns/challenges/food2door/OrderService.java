package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {

    boolean order(Customer customer, Provider provider, Product product,
                  int quantity, LocalDateTime orderDateTime);
}
