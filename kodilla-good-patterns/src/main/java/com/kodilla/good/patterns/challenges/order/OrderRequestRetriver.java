package com.kodilla.good.patterns.challenges.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest retrieve(){

        User user = new User("Marta", "Gładysz", "marta1234");
        Product product = new Product("PEDIGREE DentaStix", BigDecimal.valueOf(69.98));
        LocalDateTime orderDateTime = LocalDateTime.of(2025,9,2,9,6);

        return new OrderRequest(user, product, orderDateTime);

    }
}
