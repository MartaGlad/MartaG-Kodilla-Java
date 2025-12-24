package com.kodilla.additional.matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MatrixTranspositionTestSuite {
    @Test
    public void matrixTranspositionWhenRectangular() {
        //Given
        int[][] matrix = new int[][]{ {5,3,-2},{-7,4,8},{2,7,1},{9,5,3} };
        //When
        int[][] matrixTransposed = MatrixTransposition.transpose(matrix);
        //Then
        System.out.println(Arrays.deepToString(matrixTransposed));
    }

    @Test
    public void matrixTranspositionWhenNotRectangular() {
        //Given
        int[][] matrix = new int[][]{ {5,3},{-7,4,8},{2,7,1},{9,5,3} };
        //When & Then
        assertThrows(IllegalArgumentException.class, () -> MatrixTransposition.transpose(matrix));
    }
}
