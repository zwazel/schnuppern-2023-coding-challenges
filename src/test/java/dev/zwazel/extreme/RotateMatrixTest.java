package dev.zwazel.extreme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {
    @Test
    void rotate() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int[][] expectedMatrix = {
                {7,4,1},
                {8,5,2},
                {9,6,3},
        };

        int[][] rotatedMatrix = RotateMatrix.rotateMatrix(matrix);

        assertNotNull(rotatedMatrix);
        assertEquals(3, rotatedMatrix.length);

        for (int i = 0; i < expectedMatrix.length; i++){
            assertArrayEquals(expectedMatrix[i], rotatedMatrix[i]);
        }
    }

}
