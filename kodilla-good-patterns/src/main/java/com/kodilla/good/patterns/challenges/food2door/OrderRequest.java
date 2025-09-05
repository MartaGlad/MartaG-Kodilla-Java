package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {
    private Customer customer;
    private Provider provider;
    private Product product;
    private int quantity;
    private LocalDateTime orderDateTime;

    public OrderRequest(final Customer customer, final Provider provider,
                        final Product product, final int quantity, final LocalDateTime orderDateTime) {

        this.customer = customer;
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
        this.orderDateTime = orderDateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }
}
