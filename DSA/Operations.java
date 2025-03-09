package DSA;
import java.util.*;
public class Operations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack: " + stack);
        Queue<Integer> queue = new LinkedList();
           queue.add(1);
           queue.add(2);
           queue.add(3);
           queue.add(4);
           queue.add(5);
           queue.remove();
       System.out.println("Queue : "+queue);
       Deque<Integer> deque = new ArrayDeque();
       deque.add(3);
       deque.add(4);
       deque.add(5);
       deque.addFirst(1);
       deque.addLast(2);
       deque.removeFirst();
       System.out.println("Deque : "+deque);
    }
}
