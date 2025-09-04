package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {
    private Customer customer;
    private boolean isOrdered;

    public OrderDTO(Customer customer, boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

}
