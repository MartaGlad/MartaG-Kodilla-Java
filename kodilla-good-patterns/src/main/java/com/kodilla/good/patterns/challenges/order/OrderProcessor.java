package com.kodilla.good.patterns.challenges.order;

public class OrderProcessor {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public OrderProcessor(final OrderService orderService,
                          final OrderRepository orderRepository,
                          final InformationService informationService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDateTime());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDateTime());
            informationService.inform(orderRequest.getUser());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }

}
