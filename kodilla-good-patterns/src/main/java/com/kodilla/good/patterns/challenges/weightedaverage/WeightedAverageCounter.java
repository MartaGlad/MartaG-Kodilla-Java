package com.kodilla.good.patterns.challenges.weightedaverage;

import java.util.List;
import java.util.stream.IntStream;

public class WeightedAverageCounter {

    public static double weightedAverageCount(List<Integer> marks, List<Integer> weights)
            throws WeightedAverageException {

        if(marks.isEmpty() || weights.isEmpty() || marks.size() != weights.size()) {
            throw new WeightedAverageException("Marks or weights are incorrect!");
        }

        for (Integer m: marks) {
            if((m < 1) || (m > 6)){
                throw new WeightedAverageException("Invalid mark number!");
            }
        }

        for (Integer w: weights) {
            if((w < 1) || (w > 10)){
                throw new WeightedAverageException("Invalid weight!");
            }
        }
        double sum = 0;
        double denominator = 0;

        for (int i = 0; i < marks.size(); i++) {
            sum += marks.get(i) * weights.get(i);
            denominator += weights.get(i);
            
        }
        return sum/denominator;
    }

    public static double weightedAverageCountStream(List<Integer> marks, List<Integer> weights)
            throws WeightedAverageException {

        if (marks.isEmpty() || weights.isEmpty() || marks.size() != weights.size()) {
            throw new WeightedAverageException("Marks or weights are incorrect!");
        }

        if (marks.stream().anyMatch(m -> m < 1 || m > 6)) {
            throw new WeightedAverageException("Invalid mark number!");
        }

        if (weights.stream().anyMatch(w -> w < 1 || w > 10)) {
            throw new WeightedAverageException("Invalid weight!");
        }

        double sum = IntStream.range(0, marks.size())
                .mapToDouble(i -> marks.get(i) * weights.get(i))
                .sum();

        double denominator = weights.stream()
                .mapToDouble(Integer::doubleValue)
                .sum();

        return sum / denominator;
    }
}
