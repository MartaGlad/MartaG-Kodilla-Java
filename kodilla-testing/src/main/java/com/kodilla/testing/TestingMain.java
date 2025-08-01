package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int addResult = calculator.add(10, 20);
        int subResult = calculator.subtract(10, 20);
        if (addResult == 30) {
            System.out.println("Calculator add test OK");
        } else {
            System.out.println("Calculator add test has error!");
        }

        if (subResult == -10) {
            System.out.println("Calculator sub test OK");
        } else {
            System.out.println("Calculator sub test has error!");
        }
    }
}