package com.kodilla.additional.primenumber;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Your number is ");
        String s = PrimeNumberFinder.isPrimeNumber(number) ? "prime." : "composite.";
        System.out.println(s);

        System.out.print("Your number is ");
        s = PrimeNumberFinder.isPrimeNumberBetterPerf(number) ? "prime." : "composite.";
        System.out.println(s);
    }
}
