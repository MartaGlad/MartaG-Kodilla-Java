package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(5, 2);
        double resultSub = calculator.sub(5, 2);
        double resultMul = calculator.mul(5, 2);
        double resultDiv = calculator.div(5, 2);
        //Then
        assertEquals(7, resultAdd);
        assertEquals(3, resultSub);
        assertEquals(10, resultMul);
        assertEquals(2.5, resultDiv);

    }
}
