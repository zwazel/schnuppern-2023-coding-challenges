package dev.zwazel.easy;

import dev.zwazel.easy.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void fizzBuzz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(100));
    }
}
