package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

 public class QueueToStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int value) {
        q1.add(value);
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int poppedValue = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return poppedValue;
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int topValue = q1.poll();
        q2.add(topValue);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topValue;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        QueueToStack stack = new QueueToStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());  // Output: 3
        System.out.println(stack.top());  // Output: 2
    }
}

