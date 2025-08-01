package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void begin() {
        System.out.println("\nTest Case: begin");
    }

    @AfterEach
    public void end() {
        System.out.println("Test Case: end\n");
    }


    @DisplayName("When list is empty then exterminate() should return an empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(new ArrayList<>());
        //Then
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName("When list contains odd and even elements then exterminate() should return the even ones")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        //Then
        Assertions.assertIterableEquals(Arrays.asList(0,2,4,6,8,10), result);

    }
}
