package dev.zwazel.medium;

import java.util.Random;
import java.util.Scanner;

/**
 * Create a number guesser game where the user inputs a range of numbers
 * in which the computer selects a random number and the user has to guess it.
 * After each guess, the computer should tell the user if the guess was too high or too low.
 * Count the number of guesses and tell the user how many it took to guess the number.
 * <p>
 * For this task there are no unit test so please test it in the console.
 */
public class NumberGuesser {
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static int RANDOM_NUMBER = new Random().nextInt(100);

    public static void main(String[] args) {
        //TODO implement
    }

    /**
     * Print to the user if number is higher or lower here
     *
     * @param userInput number input by user
     * @return boolean - if is correct number
     */
    public static boolean judgeGuess(int userInput) {
        return false;//TODO implement
    }

    /**
     * Use this method to get an int from console input.
     *
     * @return int - number read from console
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
