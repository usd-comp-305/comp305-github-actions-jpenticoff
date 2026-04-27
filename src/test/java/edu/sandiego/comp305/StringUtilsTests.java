package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

public class StringUtilsTests {

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

}

