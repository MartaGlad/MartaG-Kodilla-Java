package com.kodilla.patterns.strategy.brokerage;

import com.kodilla.patterns.strategy.brokerage.predictors.BalancedPredictor;

public final class CorporateCustomer extends Customer {

    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
