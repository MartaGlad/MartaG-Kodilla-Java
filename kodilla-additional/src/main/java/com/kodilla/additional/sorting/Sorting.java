package com.kodilla.additional.sorting;

import java.util.LinkedList;
import java.util.List;

public class Sorting {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> result = new LinkedList<>();
        List<Integer> temp = new LinkedList<>(list);
        while (!temp.isEmpty()) {
            int min = MinFinder.min(temp);
            result.add(min);
            temp.remove(min);
        }
        return result;
    }


    public static List<Integer> sort2(List<Integer> list) {
        List<Integer> result = new LinkedList<>();
        while (true) {
            int min = MinFinder.min(list);
            if (min == Integer.MAX_VALUE) break;

            result.add(min);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(min)) {
                    list.set(i, -list.get(i));
                    break;
                }
            }
        }
        return result;
    }
}