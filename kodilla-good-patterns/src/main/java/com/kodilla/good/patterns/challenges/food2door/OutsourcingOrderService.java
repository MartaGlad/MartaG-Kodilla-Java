package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OutsourcingOrderService implements OrderService {

    @Override
    public boolean order(final Customer customer, final Provider provider,
                         final Product product, final int quantity, final LocalDateTime orderDateTime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("\nOrder: " + product + "\nin quantity: " + quantity +
                "\nby customer: " + customer +
                "\nfrom : " + provider + " has been sent for processing." +
                "\n" + orderDateTime.format(formatter));

        return true;
    }
}




