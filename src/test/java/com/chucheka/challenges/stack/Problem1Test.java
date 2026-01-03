package com.chucheka.challenges.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Problem1Test {

    @Test
    void testReverseStringUsingStack(){

        String input = "world";

        String result = Problem1.reverseStringUsingStack(input);

        assertEquals("dlrow", result);
    }

    @Test
    void testReverseStringUsingBuiltInStack(){

        String input = "world";

        String result = Problem1.reverseStringUsingBuiltInStack(input);

        assertEquals("dlrow", result);
    }
}