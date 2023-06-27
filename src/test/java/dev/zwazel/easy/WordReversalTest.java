package dev.zwazel.easy;

import static org.junit.jupiter.api.Assertions.*;

class WordReversalTest {
    @org.junit.jupiter.api.Test
    void reverse() {
        assertEquals("fox brown quick the", WordReversal.reverse("the quick brown fox"));
        assertEquals("sheep brown chokers the", WordReversal.reverse("the chokers brown sheep"));
    }
}
