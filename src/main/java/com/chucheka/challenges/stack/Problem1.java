package com.chucheka.challenges.stack;

import com.chucheka.implementation.stack.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem1 {

    public static String reverseStringUsingStack(String input) {

        Stack<Character> stack = new Stack<>(90);

        StringBuilder result = new StringBuilder();

        if (input.isEmpty()) return input;

        char[] chars = input.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        while (!stack.IsEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static String reverseStringUsingBuiltInStack(String input) {

        Deque<Character> stack = new ArrayDeque<>();

        StringBuilder result = new StringBuilder();

        if (input.isEmpty()) return input;

        char[] chars = input.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
