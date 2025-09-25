package com.kodilla.good.patterns.challenges;

public class MinMaxFinder {

    public long min(long[] arr) {
        long min = Long.MAX_VALUE;
        for (long value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public long max(long[] arr) {
        long max = Long.MIN_VALUE;
        for (long value: arr) {
            if (value > max){
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        long[] tab = {3,1,5,6,7,9,15,3,4,7,10};
        MinMaxFinder minMaxFinder = new MinMaxFinder();

        System.out.println("Minimum value is: " + minMaxFinder.min(tab));
        System.out.println("Maximum value is: " + minMaxFinder.max(tab));
    }
}
