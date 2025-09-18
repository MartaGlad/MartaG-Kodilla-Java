package com.kodilla.good.patterns.challenges;

public class FibonacciCount {
    public long fibonacci(long n) {
        if (n <= 1) return n;
        else return fibonacci(n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {
        FibonacciCount fibonacciCount = new FibonacciCount();
        for(int n = 0; n < 10; n++) {
            System.out.print(fibonacciCount.fibonacci(n)+" ");
        }
    }
}
