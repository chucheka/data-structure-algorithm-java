package com.chucheka.challenges.stack;

import com.chucheka.implementation.stack.Stack;


public class Problem2 {

    public static boolean balanceParentheses(String input) {

        if (input.isEmpty()) return true;

        Stack<Character> stack = new Stack<>(20);

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case '{':
                    stack.push(input.charAt(i));
                    break;
                case '}':
                    if (stack.IsEmpty()) return false;
                    stack.pop();

                    break;
            }
        }

        return stack.IsEmpty();
    }
}
