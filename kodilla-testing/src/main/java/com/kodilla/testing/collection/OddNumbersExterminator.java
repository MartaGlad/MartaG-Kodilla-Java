package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate (List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        if(!numbers.isEmpty()) {
            for(int n: numbers){
                if(n % 2 == 0){
                    result.add(n);
                }
            }
        }
        return result;
    }
}
