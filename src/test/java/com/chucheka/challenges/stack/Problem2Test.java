package com.chucheka.challenges.stack;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem2Test {

    @Test
    void testBalancedParentheses_ShouldReturnTrue_WhenStringIsEmpty(){
        assertTrue(Problem2.balanceParentheses(""));
    }

    @Test
    void testBalancedParentheses_ShouldReturnFalseForBalancedParentheses(){
        assertTrue(Problem2.balanceParentheses("{{}}"));
    }

    @Test
    void testBalancedParentheses_ShouldReturnFalseForUnbalancedParentheses(){
        assertFalse(Problem2.balanceParentheses("{}}"));
    }
}