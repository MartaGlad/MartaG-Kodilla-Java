package com.kodilla.patterns.strategy.brokerage;

import com.kodilla.patterns.strategy.brokerage.predictors.BuyPredictor;

public sealed class Customer permits
        IndividualCustomer, IndividualYoungCustomer, CorporateCustomer {

    private final String name;
    protected BuyPredictor buyPredictor;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {                   //predict() z obiektu rekomendującego zakup wywołuje
        return buyPredictor.predictWhatToBuy();  //metodę obliczającą aktualną rekomendację zakupową
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}
