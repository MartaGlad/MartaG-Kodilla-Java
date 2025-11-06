package com.kodilla.additional.weightedaverage;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> marks = List.of(6, 2, 3, 4, 4, 5, 6);
        List<Integer> weights = List.of(1, 1, 2, 4, 10, 8, 3);
        List<Integer> weightsEr = List.of(1, 1, 2, 10, 8, 3);
        List<Integer> marksEr = List.of(1, 0, 2, 10, 8, 3);
        System.out.print("Weighted average: ");
        try {
            System.out.println(WeightedAverageCounter.weightedAverageCount(marks, weights));
            System.out.println(WeightedAverageCounter.weightedAverageCount(marks, weights));
        } catch (WeightedAverageException e) {
            System.out.println(e.getMessage());
        }
    }
}
