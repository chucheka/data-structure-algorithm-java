package com.chucheka;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Simple test example")
    void testExample() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void testAssertions() {
        assertTrue(true);
        assertNotNull("Hello");
        assertFalse(false);
    }
}