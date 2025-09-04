package com.kodilla.good.patterns.challenges.food2door;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrderRequestRetriver {

    public OrderRequest retrieve() {

        Customer customer = new Customer("Marta", "Gładysz",
                "mrt@onet.pl", "123-457-650", "Warszawa, Nowy Świat 56");

        Product product = new Product("Couscous", BigDecimal.valueOf(20.70));

        LocalDateTime orderDateTime = LocalDateTime.of(2025,9,3,14,44);

        int quantity = 2;



        /*Provider provider = new Provider("Extra Food Shop sp. z o.o.", "efs@gmail.com",
                "500-500-800", "03-123 Warszawa, Psia 12", new ArrayList<>(),
                new DefaultOrderService(), new FileOrderRepository(), new PhoneService());*/

        /*Provider provider = new Provider("Gluten Free Shop sp. z o.o.", "gfs@gmail.com",
                "500-600-800", "03-128 Warszawa, Kocia 15", new ArrayList<>(),
                new OutsourcingOrderService(), new DatabaseOrderRepository(), new MailService());*/

        Provider provider = new Provider("Healthy Shop sp. z o.o.", "hs@gmail.com",
                "500-200-800", "03-128 Warszawa, Chomicza 3/6", new ArrayList<>(),
                new DefaultOrderService(), new DatabaseOrderRepository(), new PhoneService());


        return new OrderRequest(customer, provider, product, quantity, orderDateTime);

    }
}
