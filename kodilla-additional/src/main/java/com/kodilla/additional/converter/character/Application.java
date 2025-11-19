package com.kodilla.additional.converter.character;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give one digit: ");
        char c = sc.next().charAt(0);
        try {
            int number = CharConverter.convertToInt(c);
            System.out.println("Your number is: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
