package dev.zwazel.easy;

/**
 * Write a program that prints the following words for each number from 1 to 100:
 * <p>
 * “Fizz” for multiples of three.
 * “Buzz” for multiples of five.
 * “FizzBuzz” for multiples of both three and five.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = fizzBuzz(i);
            if (!output.isEmpty()) {
                System.out.println(output);
            }
        }
    }

    public static String fizzBuzz(int number) {
        return "";
    }
}
