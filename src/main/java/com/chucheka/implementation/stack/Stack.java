package com.chucheka.implementation.stack;

import com.chucheka.implementation.exceptions.EmptyStackException;
import com.chucheka.implementation.exceptions.StackOverflowException;


public class Stack<E> {
    private final E[] arr;
    private int top;
    private final int capacity;
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

        if (this.IsFull()) throw new StackOverflowException("Stack overflow error");

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

    public int size(){
        if (this.IsEmpty()) return 0;

        return this.top + 1;
    }
}
