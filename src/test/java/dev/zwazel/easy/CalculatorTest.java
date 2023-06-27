package dev.zwazel.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(2, Calculator.add(1, 1));
    }

    @Test
    void subtract() {
        assertEquals(0, Calculator.subtract(1, 1));
    }

    @Test
    void multiply() {
        assertEquals(20, Calculator.multiply(4, 5));
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.divide(4, 2));
    }
}
