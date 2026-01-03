package com.chucheka.implementation.stack;

import com.chucheka.implementation.exceptions.EmptyStackException;

import java.util.Arrays;


public class Stack<E> {
    private E[] arr;
    private int top;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack(int capacity) {
        this.capacity = capacity == 0 ? DEFAULT_CAPACITY : capacity;
        this.arr = (E[]) new Object[this.capacity];
        this.top = -1;
    }

    public boolean IsEmpty() {
        return top < 0;
    }

    public boolean IsFull() {
        return capacity == top + 1;
    }

    public void push(E value) {

        if (this.IsFull()) resize();

        this.arr[++top] = value;
    }

    public E pop() {

        if (this.IsEmpty()) throw new EmptyStackException("Popping from an empty stack");

        E value = this.arr[top];

        this.arr[top--] = null;

        return value;
    }

    public E peek() {

        if (this.IsEmpty()) throw new EmptyStackException("Peeking from an empty stack");

        return this.arr[top];
    }

    public int size() {
        if (this.IsEmpty()) return 0;

        return this.top + 1;
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        this.arr = Arrays.copyOf(this.arr, this.capacity);
    }
}
