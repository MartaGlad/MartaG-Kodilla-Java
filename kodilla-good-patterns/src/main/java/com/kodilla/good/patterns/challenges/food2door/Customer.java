package com.kodilla.good.patterns.challenges.food2door;

public class Customer {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;

    public Customer(String name, String surname, String email, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return  name + " " + surname + ", email: " + email +", phone: " + phone + ", address: " + address;
    }
}
