package com.kodilla.patterns.strategy.brokerage;

import com.kodilla.patterns.strategy.brokerage.predictors.ConservativePredictor;

public final class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
