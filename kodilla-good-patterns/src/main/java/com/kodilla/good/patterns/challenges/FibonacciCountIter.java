package com.kodilla.good.patterns.challenges;

public class FibonacciCountIter {
    public long fibonacci(long n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        FibonacciCountIter fibonacciCountIter = new FibonacciCountIter();
        for(int n = 0; n < 10; n++) {
            System.out.print(fibonacciCountIter.fibonacci(n)+" ");
        }
    }
}
