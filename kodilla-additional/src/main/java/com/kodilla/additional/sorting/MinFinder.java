package com.kodilla.additional.sorting;

import java.util.List;

public class MinFinder {
    public static int min(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int value : list) {
            if (value < min && value >= 0) {
                min = value;
            }
        }
        return min;
    }
}
