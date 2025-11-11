package com.kodilla.additional.bubbleSort;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (press Enter to stop): ");
        while (true) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            try {
                int n = Integer.parseInt(line);
                list.add(n);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number or press Enter to finish");
            }
        }
        sc.close();
        System.out.println("Sorted numbers: "+BubbleSort.sort(list));
    }
}



