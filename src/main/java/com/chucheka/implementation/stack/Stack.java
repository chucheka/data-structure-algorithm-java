package com.chucheka.implementation.stack;

import com.chucheka.implementation.exceptions.EmptyStackException;
import com.chucheka.implementation.exceptions.StackOverflowException;

public class Stack {
    private final Integer[] arr;
    private int top;
    private final int capacity;

    public Stack(int capacity) {
        this.arr = new Integer[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public boolean IsEmpty() {
        return top < 0;
    }

    public boolean IsFull() {
        return capacity == top + 1;
    }

    public void push(int value) {

        if (this.IsFull()) throw new StackOverflowException("Stack overflow error");

        this.arr[++top] = value;
    }

    public int pop() {

        if (this.IsEmpty()) throw new EmptyStackException("Popping from an empty stack");

        int value = this.arr[top];

        this.arr[top--] = null;

        return value;
    }

    public int peek() {

        if (this.IsEmpty()) throw new EmptyStackException("Peeking from an empty stack");

        return this.arr[top];
    }

    public int size(){
        if (this.IsEmpty()) return 0;

        return this.top + 1;
    }
}
