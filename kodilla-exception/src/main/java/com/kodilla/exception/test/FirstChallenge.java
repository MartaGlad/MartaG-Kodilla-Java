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

        System.out.println(firstChallenge.power(5, 3));
    }


    public int power(int base, int exp) {
        if((base < 0) || (exp < 0)) {
            throw new IllegalArgumentException("Negative arguments not supported!");
        }
        if (exp == 0) return 1;
        if (base == 0) return 0;
        else return base * power(base, exp-1);

    }

}
