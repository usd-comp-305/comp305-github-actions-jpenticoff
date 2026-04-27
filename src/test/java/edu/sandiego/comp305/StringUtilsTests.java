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
}

