package HEAPS;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(1);

        System.out.println("Max-Heap: " + maxHeap);

        // Removing the largest element
        System.out.println("Removed: " + maxHeap.poll());

        // Peek at the largest element
        System.out.println("Peek: " + maxHeap.peek());

        System.out.println("Final Max-Heap: " + maxHeap);
    }
}

