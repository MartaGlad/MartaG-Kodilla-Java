package com.kodilla.good.patterns.challenges.food2door;

public class PhoneService implements InformationService {

    public void inform(Customer customer) {
        System.out.println("\nSMS: Your order has been accomplished.");
    }
}
