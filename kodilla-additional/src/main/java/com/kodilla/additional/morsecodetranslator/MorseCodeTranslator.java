package com.kodilla.additional.morsecodetranslator;

import java.util.Map;

public class MorseCodeTranslator {

    private static Map<String,String> morseMap = Map.ofEntries (
            Map.entry(".-","A"),
            Map.entry("-...", "B"),
            Map.entry("-.-.", "C"),
            Map.entry("-..","D"),
            Map.entry(".","E"),
            Map.entry("..-.", "F"),
            Map.entry("--.", "G"),
            Map.entry("....", "H"),
            Map.entry("..", "I"),
            Map.entry(".---", "J"),
            Map.entry("-.-", "K"),
            Map.entry(".-..", "L"),
            Map.entry("--", "M"),
            Map.entry("-.", "N"),
            Map.entry("---", "O"),
            Map.entry(".--.", "P"),
            Map.entry("--.-", "Q"),
            Map.entry(".-.", "R"),
            Map.entry("...", "S"),
            Map.entry("-", "T"),
            Map.entry("..-", "U"),
            Map.entry("...-", "V"),
            Map.entry(".--", "W"),
            Map.entry("-..-", "X"),
            Map.entry("-.--", "Y"),
            Map.entry("--..", "Z")
    );

    public static String decode(String morseCodedString) {
        StringBuilder decodedString = new StringBuilder();
        String[] morseCodedStringArray = morseCodedString.split(" ");
        for(String s: morseCodedStringArray) {
            if (s.isEmpty()) {
                decodedString.append(" ");
            } else {
                decodedString.append(morseMap.getOrDefault(s, "?"));
            }
        }
        return decodedString.toString();
    }

    public static String decode1(String morseCodedString) {
        StringBuilder decodedString = new StringBuilder();
        String[] morseCodedStringArray = morseCodedString.split(" ");
        for(String s : morseCodedStringArray) {
            switch (s) {
                case ".-" -> decodedString.append("A");
                case "-..." -> decodedString.append("B");
                case "-.-." -> decodedString.append("C");
                case "-.." -> decodedString.append("D");
                case "." -> decodedString.append("E");
                case "..-." -> decodedString.append("F");
                case "--." -> decodedString.append("G");
                case "...." -> decodedString.append("H");
                case ".." -> decodedString.append("I");
                case ".---" -> decodedString.append("J");
                case "-.-" -> decodedString.append("K");
                case ".-.." -> decodedString.append("L");
                case "--" -> decodedString.append("M");
                case "-." -> decodedString.append("N");
                case "---" -> decodedString.append("O");
                case ".--." -> decodedString.append("P");
                case "--.-" -> decodedString.append("Q");
                case ".-." -> decodedString.append("R");
                case "..." -> decodedString.append("S");
                case "-" -> decodedString.append("T");
                case "..-" -> decodedString.append("U");
                case "...-" -> decodedString.append("V");
                case ".--" -> decodedString.append("W");
                case "-..-" -> decodedString.append("X");
                case "-.--" -> decodedString.append("Y");
                case "--.." -> decodedString.append("Z");
                case "" -> decodedString.append(" ");
                default -> decodedString.append("?");
            }
        }
        return decodedString.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(decode(".- -.. .- --  -.- --- -.. .. .-.. .-.. .-"));
        System.out.println(decode1(".- -.. .- --  -.- --- -.. .. .-.. .-.. .-"));
    }
}
