package com.kodilla.good.patterns.challenges;

public class FactorialCount {

    public long factorial(long value) {
        if ((value == 0) || (value == 1)) return 1;
        else return value * factorial(value-1);

    }

    public static void main(String[] args) {
        FactorialCount factorialCount = new FactorialCount();
        System.out.println(factorialCount.factorial(4));
    }
}
