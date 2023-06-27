package dev.zwazel.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidPrinterTest {
    @Test
    void pyramidString() {
        String pyramid = PyramidPrinter.pyramidString(3);
        assertEquals("  *\n" +
                " * *\n" +
                "* * *", pyramid);
    }
}
