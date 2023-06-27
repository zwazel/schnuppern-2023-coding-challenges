package dev.zwazel.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void buzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(100));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
}
