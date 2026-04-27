package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTests {

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReversePalindrome() {
        assertEquals("racecar", StringUtils.reverseString("racecar"));
    }

    @Test
    void testReverseEvenString() {
        assertEquals("dcba", StringUtils.reverseString("abcd"));
    }

    @Test
    void testReverseOddString() {
        assertEquals("edcba", StringUtils.reverseString("abcde"));
    }

    @Test
    void testReverseStringWithSpaces() {
        assertEquals("edc ba", StringUtils.reverseString("ab cde"));
    }

    @Test
    void testReverseStringWithNumbers() {
        assertEquals("21cba", StringUtils.reverseString("abc12"));
    }

    @Test
    void testReverseStringWithSpecialCharacter() {
        assertEquals(".cba", StringUtils.reverseString("abc."));
    }
}

