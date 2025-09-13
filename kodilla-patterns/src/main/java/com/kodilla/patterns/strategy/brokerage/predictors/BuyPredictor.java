package com.kodilla.patterns.strategy.brokerage.predictors;

public sealed interface BuyPredictor
    permits AggressivePredictor, BalancedPredictor, ConservativePredictor {

    String predictWhatToBuy();

}
