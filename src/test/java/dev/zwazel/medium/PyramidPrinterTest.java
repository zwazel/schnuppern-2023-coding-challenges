package dev.zwazel.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PyramidPrinterTest {
    @Test
    void getPyramid() {
        String expected = "  *  \n" +
                " * * \n" +
                "* * *";

        assertEquals(expected, PyramidPrinter.getPyramid(3));
    }
}
