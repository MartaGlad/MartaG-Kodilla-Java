package com.kodilla.additional;

public class FibonacciCounter {
    public static long fibonacciIter(long n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c = 0;
        for (long i = 2; i <= n; i++) {
            c = a + b; // 1 2 3
            a = b;  // 1 1 2
            b = c;  //1 2 3
        }
        return c;
    }

    public static long fibonacciRec(long n) {
        if (n <= 1) return n;
        else return fibonacciRec(n-2) + fibonacciRec(n-1);
    }

    public static void main(String[] args) {
        for(int n = 0; n < 10; n++) {
            System.out.print(fibonacciIter(n)+" ");
        }
        System.out.println();
        for(int n = 0; n < 10; n++) {
            System.out.print(fibonacciRec(n)+" ");
        }
    }
}
