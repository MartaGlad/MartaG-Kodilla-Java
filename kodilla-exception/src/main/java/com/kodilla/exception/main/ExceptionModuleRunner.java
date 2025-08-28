package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        //fileReader.readFile();*/

        //FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();

        try {
            //System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {

            System.out.println("Problem while reading a file");
        }

    }

}
