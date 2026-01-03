package com.chucheka.implementation.queue;

import com.chucheka.implementation.exceptions.EmptyQueueException;
import com.chucheka.implementation.exceptions.QueueOverFlowException;

public class CircularQueue<E> {

    private E[] arr;
    private Integer capacity;
    private int front, rear;


    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = (E[]) new Object[this.capacity];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(E value) {
        if (isFull()) {
            throw new QueueOverFlowException("inserting into a queue that is already full");
        }
        if (isEmpty()) {
            front += 1;
        }
        this.rear = (rear + 1) % this.capacity;
        this.arr[rear] = value;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("queue is empty");
        }

        E value = this.arr[front];
        this.arr[front] = null;

        if (this.front == this.rear) {
            this.front = -1;
            this.rear = -1;
        } else {
            front = (front + 1) % this.capacity;
        }

        return value;
    }

    public E peek(){
        if (isEmpty()) {
            throw new EmptyQueueException("queue is empty");
        }
        return this.arr[front];
    }

    public int size() {
        if (isEmpty()) return 0;

        if (this.front == this.rear) return 1;

        return rear - front + 1;
    }

    public boolean isEmpty() {
        return this.front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % this.capacity == front;
    }
}
