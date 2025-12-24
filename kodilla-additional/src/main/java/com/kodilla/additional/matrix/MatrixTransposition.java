package com.kodilla.additional.matrix;

public class MatrixTransposition {
    public static int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is null or empty.");
        }
        int colsNum = matrix[0].length;
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i].length != colsNum) {
                throw new IllegalArgumentException("Matrix is not rectangular.");
            }
        }
        int[][] matrixTransposed = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrixTransposed[j][i] = matrix[i][j];
            }
        }
        return matrixTransposed;
    }
}
