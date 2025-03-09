package HEAPS;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(1);

        System.out.println("Min-Heap: " + minHeap);

        // Removing the smallest element
        System.out.println("Removed: " + minHeap.poll());

        // Peek at the smallest element
        System.out.println("Peek: " + minHeap.peek());

        System.out.println("Final Min-Heap: " + minHeap);
    }
}

