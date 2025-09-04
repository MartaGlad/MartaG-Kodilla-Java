package com.kodilla.good.patterns.challenges.food2door;


public class MailService implements InformationService {

    @Override
    public void inform(Customer customer) {
        System.out.println("\nE-mail: Your order has been accomplished.");

    }
}

