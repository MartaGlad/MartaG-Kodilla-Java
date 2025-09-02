package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDateTime());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDateTime());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        }
    }

}
