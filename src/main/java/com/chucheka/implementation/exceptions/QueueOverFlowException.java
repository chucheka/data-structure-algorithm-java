package com.chucheka.implementation.exceptions;

public class QueueOverFlowException extends RuntimeException {
    public QueueOverFlowException(String message) {
        super(message);
    }
}
