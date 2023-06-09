package dev.zwazel.medium;

import dev.zwazel.medium.Anagrams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramsTest {
    @Test
    void isAnagram() {
        assertTrue(Anagrams.isAnagram("listen", "silent"));
        assertTrue(Anagrams.isAnagram("elbow", "below"));
        assertTrue(Anagrams.isAnagram("desserts", "stressed"));
        assertTrue(Anagrams.isAnagram("dormitory", "dirty room"));
        assertTrue(Anagrams.isAnagram("astronomer", "moon starer"));
    }

    @Test
    void isNotAnagram() {
        assertFalse(Anagrams.isAnagram("listen", "silently"));
        assertFalse(Anagrams.isAnagram("elbow", "belows"));
        assertFalse(Anagrams.isAnagram("dessert", "stressed"));
        assertFalse(Anagrams.isAnagram("dormitory", "dirty rooms"));
        assertFalse(Anagrams.isAnagram("astronomer", "moon starers"));
    }
}
