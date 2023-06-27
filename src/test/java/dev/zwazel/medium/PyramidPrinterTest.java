package dev.zwazel.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidPrinterTest {
    @Test
    void pyramidString() {
        assertEquals(" *\n" +
                "***", PyramidPrinter.pyramidString(3));

        assertEquals("  *\n" +
                " ***\n" +
                "*****", PyramidPrinter.pyramidString(5));
    }
}
