package dev.zwazel.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Warmup challenge: Write a calculator that can add, subtract, multiply, and divide two numbers.
 */
public class Calculator {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input the first number:");
        int a = readInt();

        System.out.println("Please input the second number:");
        int b = readInt();

        System.out.println("Please input the operation (" + Arrays.stream(Operation.values()).map(operationMapped -> operationMapped.symbol).collect(Collectors.joining(", ")) + "):");
        Operation operation = readOperation();

        float result = 0;
        switch (operation) {
            case ADD:
                // TODO
                result = add(a, b);
                break;
            case SUBTRACT:
                // TODO
                result = subtract(a, b);
                break;
            case MULTIPLY:
                // TODO
                result = multiply(a, b);
                break;
            case DIVIDE:
                // TODO
                result = divide(a, b);
                break;
        }

        System.out.println("Result: " + result);
    }

    public static int add(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public static int subtract(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public static int multiply(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public static int divide(int a, int b) {
        throw new UnsupportedOperationException();
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

    /**
     * Use this method to get a valid operation from console input.
     *
     * @return Operation
     */
    private static Operation readOperation() {
        while (true) {
            String input = SCANNER.nextLine();
            Operation operation = Operation.fromString(input);
            if (operation != null) {
                return operation;
            }
            System.out.println("Please input a valid operation (" + Arrays.stream(Operation.values()).map(operationMapped -> operationMapped.symbol).collect(Collectors.joining(", ")) + "):");
        }
    }
}

enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    final String symbol;

    Operation(String s) {
        this.symbol = s;
    }

    public static Operation fromString(String s) {
        for (Operation operation : Operation.values()) {
            if (operation.symbol.equals(s)) {
                return operation;
            }
        }
        return null;
    }
}
