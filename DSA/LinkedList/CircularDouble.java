package DSA.LinkedList;

public class CircularDouble {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void insertFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            head.next = head; 
            head.prev = head; 
        } else {
            temp.next = head;
            temp.prev = tail;
            head.prev = temp;
            tail.next = temp;
            head = temp;
        }
        size++;
    }

    public void insertLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            head.next = head; // Point to itself
            head.prev = head; // Point to itself
        } else {
            tail.next = temp;
            temp.prev = tail;
            temp.next = head;
            head.prev = temp;
            tail = temp;
        }
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
    }

    public void insertAt(int position, int data) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
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

        Node temp = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        temp.next = current.next;
        temp.prev = current;
        current.next.prev = temp;
        current.next = temp;
        size++;
    }

    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            deleteFirst();
            return;
        }
        if (position == size) {
            deleteLast();
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        current.next.prev = current;
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);  
        System.out.println("END");
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public void find(int value) {
        Node node = head;
        do {
            if (node.data == value) {
                System.out.println("Node with value " + value + " found.");
                return;
            }
            node = node.next;
        } while (node != head);  // Loop until we come back to the head
        System.out.println("Node with value " + value + " not found.");
    }

    public static void main(String[] args) {
        CircularDouble x = new CircularDouble();
        x.insertFirst(10);
        x.insertFirst(20);
        x.insertFirst(30);
        x.insertLast(40);
        x.deleteFirst();
        x.deleteLast();
        x.insertAt(1, 30);
        System.out.println(x.get(2));
        x.find(30);
        x.display();
    }
}
