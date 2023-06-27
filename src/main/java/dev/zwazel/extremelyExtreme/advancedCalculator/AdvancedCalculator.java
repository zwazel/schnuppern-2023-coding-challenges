package dev.zwazel.extremelyExtreme.advancedCalculator;

import dev.zwazel.extremelyExtreme.advancedCalculator.enums.Operator;

import java.util.Scanner;

/**
 * Write an advanced calculator that can solve expressions.
 * For example: 3*(1+2)-3
 * For this finish the {@link ShuntingYard} class.
 * Also add a Division Operator to the {@link Operator} enum, Make sure to handle the division by zero case.
 */
public class AdvancedCalculator {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an expression to evaluate:");
        String expression = SCANNER.nextLine();
        System.out.println("Result: " + ShuntingYard.evaluatePostfix(ShuntingYard.convertToPostfix(expression)));
    }
}

