package com.kodilla.good.patterns.challenges.food2door;


import java.util.List;

public class Provider implements OrderProcessorLogic {
    private String name;
    private String email;
    private String phone;
    private String address;
    private List<Product> products;

    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public Provider(final String name, final String email, final String phone, final String address,
                    List<Product> products, final OrderService orderService,
                    final OrderRepository orderRepository, final InformationService informationService) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.products = products;

        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    @Override
    public OrderDTO process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getProvider(),
                orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getOrderDateTime());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getProvider(),
                    orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getOrderDateTime());
            informationService.inform(orderRequest.getCustomer());

            return new OrderDTO(orderRequest.getCustomer(), true);

        } else {
            return new OrderDTO(orderRequest.getCustomer(), false);
        }

    }

    @Override
    public String toString() {
        return name + ", email: " + email;
    }
}
