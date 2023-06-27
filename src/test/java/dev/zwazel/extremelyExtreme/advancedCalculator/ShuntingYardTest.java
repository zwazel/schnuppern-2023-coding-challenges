package dev.zwazel.extremelyExtreme.advancedCalculator;

import dev.zwazel.extremelyExtreme.advancedCalculator.ShuntingYard;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShuntingYardTest {

    @Test
    void evaluatePostfix() {
        ArrayDeque<String> postfix = new ArrayDeque<>();
        postfix.add("2");
        assert ShuntingYard.evaluatePostfix(postfix) == 2;

        postfix = new ArrayDeque<>();
        postfix.add("1");
        postfix.add("2");
        postfix.add("+");
        assert ShuntingYard.evaluatePostfix(postfix) == 3;

        postfix = new ArrayDeque<>();
        postfix.add("3");
        postfix.add("1");
        postfix.add("2");
        postfix.add("+");
        postfix.add("*");
        assert ShuntingYard.evaluatePostfix(postfix) == 9;

        postfix = new ArrayDeque<>();
        postfix.add("-3");
        postfix.add("2");
        postfix.add("+");
        assert ShuntingYard.evaluatePostfix(postfix) == -1;
    }

    @Test
    void convertToPostfix() {
        ArrayDeque<String> result = ShuntingYard.convertToPostfix("2");
        String[] expected = {"2"};
        assertArrayEquals(expected, result.toArray());

        result = ShuntingYard.convertToPostfix("1+2");
        String[] expected2 = {"1", "2", "+"};
        assertArrayEquals(expected2, result.toArray());

        result = ShuntingYard.convertToPostfix("3*(1+2)");
        String[] expected3 = {"3", "1", "2", "+", "*"};
        assertArrayEquals(expected3, result.toArray());

        result = ShuntingYard.convertToPostfix("-3+2");
        String[] expected4 = {"-3", "2", "+"};
        assertArrayEquals(expected4, result.toArray());
    }
}
