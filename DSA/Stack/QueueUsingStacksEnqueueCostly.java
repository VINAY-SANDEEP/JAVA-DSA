package DSA.Stack;

import java.util.Stack;

 public class QueueUsingStacksEnqueueCostly {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation (costly)
    public void enqueue(int data) {
        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push new element to stack1
        stack1.push(data);

        // Move everything back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Dequeue operation (efficient)
    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack1.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacksEnqueueCostly queue = new QueueUsingStacksEnqueueCostly();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
    }
}

