package dev.zwazel.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(2, Calculator.calculate('+', 1, 1));
    }

    @Test
    void subtract() {
        assertEquals(0, Calculator.calculate('-', 1, 1));
    }

    @Test
    void multiply() {
        assertEquals(20, Calculator.calculate('*', 4, 5));
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.calculate('/', 4, 2));

        assertThrows(ArithmeticException.class, () -> Calculator.calculate('/', 4, 0));
    }

    @Test
    void unknownOperator() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate('?', 4, 2));
    }
}
