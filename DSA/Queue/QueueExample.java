package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.offer(20);
        queue.offer(30);
        
        System.out.println("Queue: " + queue);

        // Get the front element without removing
        System.out.println("Front element (peek): " + queue.peek());

        // Remove elements from the queue
        System.out.println("Removed element (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Get the front element using element()
        System.out.println("Front element (element): " + queue.element());

        // Remove an element using remove()
        System.out.println("Removed element (remove): " + queue.remove());

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Clear the queue
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}
