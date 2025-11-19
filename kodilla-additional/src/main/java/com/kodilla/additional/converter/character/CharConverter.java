package com.kodilla.additional.converter.character;

public class CharConverter {

    public static int convertToInt(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("Character" + c + "is not a digit.");
        }
        return c - '0';
    }
}
