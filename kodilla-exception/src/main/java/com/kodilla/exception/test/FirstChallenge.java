package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3, 4);
        } catch (Exception e) {
           System.out.println("Exception: " + e);
        } finally {
            System.out.println(result);
        }

        System.out.println(firstChallenge.power(4, 1));
    }


    public long power(long base, long exponent) {
        if ((base == 0) || (exponent == 0)) return 1;
        else return base * power(base, exponent-1);

    }

}
