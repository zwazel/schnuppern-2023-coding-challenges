package dev.zwazel.extreme;

/**
 * Challenge: Rotate a matrix by 90 degrees.
 *
 * Example:
 * before:
 * 1, 2, 3
 * 4, 5, 6
 * 7, 8, 9
 * <p>
 * after:
 * 7, 4, 1
 * 8, 5, 2
 * 9, 6, 3
 */
public class RotateMatrix {
    /**
     * TODO: Rotate the matrix by 90 degrees.
     *
     * @param array int[][]
     * @return int[][]
     */
    public static int[][] rotateMatrix(int[][] array) {
        return null;
    }

    /**
     * Utility method to get a String representation of a matrix.
     *
     * @param array int[][]
     * @return String
     */
    private static String getMatrix(int[][] array) {
        StringBuilder result = new StringBuilder();
        for (int[] i : array) {
            for (int j : i) {
                result.append(j);
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Set the height and width of the matrix
        int width = 3;
        int height = 3;

        // Init the array
        int[][] array = new int[height][width];
        int counter = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = counter++;
            }
        }

        System.out.println("before:\n" + getMatrix(array));

        int[][] newMatrix = rotateMatrix(array);

        System.out.println("after:\n" + getMatrix(newMatrix));
    }
}
