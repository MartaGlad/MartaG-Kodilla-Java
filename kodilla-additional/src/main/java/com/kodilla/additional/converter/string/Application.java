package com.kodilla.additional.converter.string;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        String line = sc.nextLine();
        int number;
        try {
            number = StringConverter.convertToInt(line.trim());
            System.out.println("Your number is: "+ number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
