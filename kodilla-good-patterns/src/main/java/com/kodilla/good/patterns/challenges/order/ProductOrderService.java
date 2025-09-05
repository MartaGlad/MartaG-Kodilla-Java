package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final User user, final Product product, final LocalDateTime orderDateTime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("\nOrdering product: "+product.getName()+
                " by user: "+user.getName()+" "+user.getSurname()+
                " ("+user.getNickname()+")- "
                +orderDateTime.format(formatter));

        return true;
    }

}
