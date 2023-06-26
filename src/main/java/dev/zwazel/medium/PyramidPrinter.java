package dev.zwazel.medium;

import java.util.Scanner;

/**
 * Write a program that takes a number as input and outputs a pyramid of that width.
 * Example: if number is 3, console output should be:
    *
   * *
  * * *
 */
public class PyramidPrinter {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

    }

    /**
     * Use this method to get an int from console input.
     *
     * @return int
     */
    private static int readInt() {
        while (!SCANNER.hasNextInt()) {
            System.out.println("Please input a valid int!");
            SCANNER.next();
        }
        int out = SCANNER.nextInt();
        SCANNER.nextLine();
        return out;
    }
}
