package dev.zwazel.extremelyExtreme.advancedCalculator.enums;

public enum Operator {
    OPENING_BRACKET(false, '(', null, null),
    CLOSING_BRACKET(false, ')', null, null),
    ADD(true, '+', Priority.LOW, Double::sum),
    SUBTRACT(true, '-', Priority.LOW, (a, b) -> a - b),
    MULTIPLY(true, '*', Priority.MIDDLE, (a, b) -> a * b);

    // TODO: Add Divide operator, make sure you handle division by zero.
    // TODO: If you want you can add other operators, for example: modulo, power, root, sin, cos, tan, log, etc.

    private final boolean leftAssociative;
    private final char symbol;
    private final Priority priority;
    private final CalculationInterface calculationInterface;

    Operator(boolean leftAssociative, char symbol, Priority priority, CalculationInterface calculationInterface) {
        this.leftAssociative = leftAssociative;
        this.symbol = symbol;
        this.priority = priority;
        this.calculationInterface = calculationInterface;
    }

    public static Operator getOperatorFromChar(char symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.symbol == symbol && operator.getCalculationInterface() != null && operator.getPriority() != null) {
                return operator;
            }
        }
        return null;
    }

    /**
     * Use this method on an operator to calculate the result of the operation.
     *
     * @param a number 1
     * @param b number 2
     * @return the result of the calculation
     */
    public double calc(double a, double b) {
        return calculationInterface.calc(a, b);
    }

    public boolean isLeftAssociative() {
        return leftAssociative;
    }

    public char getSymbol() {
        return symbol;
    }

    public Priority getPriority() {
        return priority;
    }

    public CalculationInterface getCalculationInterface() {
        return calculationInterface;
    }
}
