package com.kodilla.additional.converter.decimalToBinary;

public class DecimalConverter {
    public static String convertToBinaryString(int value) {
        if(value < 0) {
            return Integer.toBinaryString(value);
        }
        if (value == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            sb.append(value % 2);
            value /= 2;
        }
    return sb.reverse().toString();
    }
}
