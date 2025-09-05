package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DefaultOrderService implements OrderService {

    @Override
    public boolean order(final Customer customer, final Provider provider,
                         final Product product, final int quantity, final LocalDateTime orderDateTime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("\nOrdering product: " + product + "\nin quantity: " + quantity +
                "\nby customer: " + customer +
                "\nfrom provider: " + provider + "\n" + orderDateTime.format(formatter));

        return true;
    }
}
