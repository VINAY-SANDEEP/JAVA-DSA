package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStackOptimized {
    private Queue<Integer> q = new LinkedList<>();

    public void push(int value) {
        int size = q.size();
        q.add(value);
        for (int i = 0; i < size; i++) {
            q.add(q.poll());  // Move previous elements behind the new one
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.poll();
    }

    public int top() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        QueueToStackOptimized stack = new QueueToStackOptimized();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());  // Output: 3
        System.out.println(stack.top());  // Output: 2
    }
}

