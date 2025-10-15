package com.kodilla.good.patterns.challenges;

public class FactorialCount {

    public static long factorialIter(long value) {
        long factorial = 1;
        if(value > 0) {
            for (long i = 1; i <= value; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static long factorialRec(long value) {
        if (value == 0) return 1;
        else return value * factorialRec(value-1);
    }



    public static void main(String[] args) {
        System.out.println("Silnia iteracyjnie: " + factorialIter(4));
        System.out.println("Silnia rekurencyjne: " + factorialRec(4));

    }
}
