package com.chucheka.implementation.stack;

import com.chucheka.implementation.exceptions.EmptyStackException;
import com.chucheka.implementation.exceptions.StackOverflowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setup() {
        stack = new Stack<>(5);
    }

    @Test
    void testIsEmpty_ShouldReturnTrue_WhenTheStackIsEmpty() {
        boolean isEmpty = stack.IsEmpty();
        assertTrue(isEmpty);
    }

    @Test
    void testIsFull_ShouldReturnFalse_WhenStackIsNotFull() {
        boolean isFull = stack.IsFull();
        assertFalse(isFull);
    }

    @Test
    void testPush_ShouldNotThrowStackOverflowException_WhenStackIsNotFull() {
        stack.push(10);
    }

    @Test
    void testPush_ShouldThrowStackOverFlowException_WhenPushingToAlreadyFullStack() {
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);

        assertThrows(StackOverflowException.class, () -> stack.push(12));
    }

    @Test
    void testPeek_ShouldNotThrowEmptyStackException_WhenStackIsNotEmpty() {
        stack.push(8);
        stack.push(10);

        assertDoesNotThrow(() -> stack.peek());

        assertEquals(10, stack.peek());
    }

    @Test
    void testPeek_ShouldThrowEmptyStackException_WhenStackIsEmpty() {
        assertThrows(EmptyStackException.class, ()->stack.peek());
    }

    @Test
    void testSize_ShouldReturnZero_WhenStackIsEmpty() {
        assertEquals(0, stack.size());
    }

    @Test
    void testSize_ShouldReturnCorrectSize_WhenStackIsNotEmpty() {
        stack.push(2);
        stack.push(4);
        assertEquals(2, stack.size());
    }
}