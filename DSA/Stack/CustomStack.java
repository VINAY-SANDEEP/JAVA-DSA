package DSA.Stack;
public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= ptr; i++) {
            sb.append(data[i]);
            if (i < ptr) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            CustomStack stack = new CustomStack(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Stack: " + stack);
            System.out.println("Peek: " + stack.peek());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Stack after pop: " + stack);
            stack.push(4);
            stack.push(5);
            System.out.println("Attempt to push to full stack: " + stack.push(6));
            System.out.println("Final Stack: " + stack);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
