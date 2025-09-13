package com.kodilla.patterns.strategy.brokerage;

import com.kodilla.patterns.strategy.brokerage.predictors.AggressivePredictor;

public final class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
