package DSA.LinkedList;

public class ll {
    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    public void insertFirst(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void insertLast(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "  ->  ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    public void insertAt(int position, int data) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 0) {
            insertFirst(data);
            return;
        }
        if (position == size) {
            insertLast(data);
            return;
        }
        Node link = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        link.next = current.next;
        current.next = link;
        size++;
    }
    public void delAt(int position) {
        if (position > size) {
            throw new IndexOutOfBoundsException();
        }
        if (position == 0) {
            deleteFirst();
            return;
        }
        if (position == size - 1) {
            deleteLast();
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        Node link = current.next.next;
        current.next = link;
        size--;
    }
    public void printRev() {
        helper(head);
    }
    private void helper(Node head) {
        if (head == null) {
            return;
        }
        helper(head.next);
        System.out.print(head.value + " -> ");
    }
    // Corrected reverse linked list
    public void reverseLL() {
        reverseRecursively(head);
    }
    private void reverseRecursively(Node current) {
        // Base case: If list is empty or only one node
        if (current == null || current.next == null) {
            head = current;
            return;
        }
        // Recursively reverse the rest of the list
        reverseRecursively(current.next);

        // Make the next node of the current point to the current node
        current.next.next = current;
        current.next = null;

        // Update the tail
        tail = current;
    }
 public void noramlREV(){
    Node current = head;
    Node prev = null;
    Node next = null;
    while (current!=null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
 }
    public static void main(String[] args) {
        ll x = new ll();
        x.insertFirst(1);
        x.insertFirst(2);
        x.insertFirst(3);
        x.insertFirst(4);
        x.display(); // Output: 4  ->  3  ->  2  ->  1  ->  end
        x.insertLast(5);
        x.display(); // Output: 4  ->  3  ->  2  ->  1  ->  5  ->  end
        x.deleteFirst();
        x.display(); // Output: 3  ->  2  ->  1  ->  5  ->  end
        x.deleteLast();
        x.display(); // Output: 3  ->  2  ->  1  ->  end
        x.insertAt(2, 12);
        x.display(); // Output: 3  ->  2  ->  12  ->  1  ->  end
        x.delAt(2);
        x.display(); // Output: 3  ->  2  ->  1  ->  end
        x.printRev(); // Output: 1 -> 2 -> 3 ->
        // Reverse the linked list and display
        x.reverseLL();
        x.display(); // Output: 1  ->  2  ->  3  ->  end
        x.noramlREV();
        x.display();
    }
}
