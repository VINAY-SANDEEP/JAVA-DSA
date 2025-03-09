package DSA.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peeking top element
        System.out.println("Top element: " + stack.peek());

        // Popping element
        System.out.println("Popped element: " + stack.pop());

        // Checking size
        System.out.println("Stack size: " + stack.size());

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching an element
        System.out.println("Position of 10: " + stack.search(10));

        // Clearing the stack
        stack.clear();
        System.out.println("Stack cleared, is empty? " + stack.isEmpty());
    }
}

