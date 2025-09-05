package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime orderDateTime;

    public OrderRequest(final User user, final Product product, final LocalDateTime orderDateTime) {
        this.user = user;
        this.product = product;
        this.orderDateTime = orderDateTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }
}
