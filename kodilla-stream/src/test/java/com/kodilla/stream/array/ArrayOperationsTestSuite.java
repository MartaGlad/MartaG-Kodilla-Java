package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] tab = new int[] {6, 12, 45, 67, 1, 0, 8, -6, -23, 15};
        //When;
        double average = ArrayOperations.getAverage(tab);
        //Then
        assertEquals(12.5, average);

    }
}
