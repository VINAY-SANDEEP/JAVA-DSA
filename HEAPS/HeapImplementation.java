package HEAPS;

class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    private int getParent(int index) { return (index - 1) / 2; }
    private int getLeftChild(int index) { return 2 * index + 1; }
    private int getRightChild(int index) { return 2 * index + 2; }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;

        while (current > 0 && heap[current] < heap[getParent(current)]) {
            swap(current, getParent(current));
            current = getParent(current);
        }
    }

    public int removeMin() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return min;
    }

    private void heapify(int index) {
        int left = getLeftChild(index);
        int right = getRightChild(index);
        int smallest = index;

        if (left < size && heap[left] < heap[smallest])
            smallest = left;

        if (right < size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}

public class HeapImplementation {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);
        minHeap.insert(30);
        minHeap.insert(3);

        System.out.println("Heap elements:");
        minHeap.printHeap();

        System.out.println("Removed: " + minHeap.removeMin());
        System.out.println("Heap after removal:");
        minHeap.printHeap();
    }
}

