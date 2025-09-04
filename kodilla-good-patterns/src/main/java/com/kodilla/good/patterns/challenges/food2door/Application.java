package com.kodilla.good.patterns.challenges.food2door;


public class Application {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        orderRequest.getProvider().process(orderRequest);

    }
}
