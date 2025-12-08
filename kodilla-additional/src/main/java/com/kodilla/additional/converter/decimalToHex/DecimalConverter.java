package com.kodilla.additional.converter.decimalToHex;

public class DecimalConverter {
    public static String convertToHexString(int value) {
        if (value < 0) {
            return "-" + convertToHexString(-value);
        }
        if (value == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (value > 0) {
           int rest = value % 16;
           if (rest < 10) {
               sb.append(rest);
           }
           else {
               sb.append((char) ('A' + (rest - 10)));
           }
           value /= 16;
        }
        return sb.reverse().toString();
    }
}
