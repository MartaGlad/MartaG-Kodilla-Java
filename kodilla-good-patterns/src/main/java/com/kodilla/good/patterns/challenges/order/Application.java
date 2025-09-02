package com.kodilla.good.patterns.challenges.order;



import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        /*User user = new User("Marta", "Gładysz", "marta1234");
        Product product = new Product("PEDIGREE DentaStix", BigDecimal.valueOf(69.98));
        LocalDateTime orderDateTime = LocalDateTime.of(2025,9,2,9,6);
*/
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(),
                new ProductOrderRepository());

        orderProcessor.process(orderRequest);


        /*ProductOrderService productOrderService = new ProductOrderService();
        boolean isOrdered = productOrderService.order(user, product, orderDateTime);

        MailService mailService = new MailService();
        ProductOrderRepository productOrderRepository = new ProductOrderRepository();

        if (isOrdered) {
            mailService.inform(user);
            productOrderRepository.createProductOrder(user, orderDateTime);
        } else {
            System.out.println("Product order has been rejected");
            
        }*/
    }
}
