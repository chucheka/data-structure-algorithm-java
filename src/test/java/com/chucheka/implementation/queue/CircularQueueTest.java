package com.chucheka.implementation.queue;

import com.chucheka.implementation.exceptions.EmptyQueueException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CircularQueueTest {

    private CircularQueue<Integer> queue;

    @BeforeEach
    void setup() {
        queue = new CircularQueue<>(5);
    }

    @Test
    public void testIsEmpty_ShouldReturnTrue_WhenQueueIsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsFull_ShouldReturnFalse_WhenQueueIsNotFull() {
        assertFalse(queue.isFull());
    }

    @Test
    public void testEnqueue_ShouldBeAbleToEnqueue_WhenQueueIsNotFull() {
        assertDoesNotThrow(() -> queue.enqueue(2));
        assertEquals(1, queue.size());
    }


    @Test
    public void testDequeue_ShouldThrowException_WhenQueueIsEmpty() {
        assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }

    @Test
    public void testDequeue_ShouldBeAbleToDequeue_WhenQueueIsNotEmpty() {
        queue.enqueue(3);
        int value = queue.dequeue();
        assertEquals(3, value);
        assertEquals(0, queue.size());
    }

    @Test
    public void testPeek_ShouldThrowException_WhenQueueIsEmpty() {
        assertThrows(EmptyQueueException.class, () -> queue.peek());
    }

    @Test
    public void testPeek_ShouldReturnFirstElement_WhenQueueIsNotEmpty() {
        queue.enqueue(3);
        queue.enqueue(5);
        assertEquals(3, queue.peek());
    }
}