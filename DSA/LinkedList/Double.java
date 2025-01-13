package DSA.LinkedList;
public class Double {
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
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    public void insertLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
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
            head.prev = null;
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
            tail.next = null;
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
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
        while (node != null) {
            if (node.data == value) {
                System.out.println("Node with value " + value + " found.");
                return;
            }
            node = node.next;
        }
        System.out.println("Node with value " + value + " not found.");
    }
   Node reverseList(Node head) {
        // code here
         Node temp = head;
        Node prev = null;
        Node next = null;
        
        while(temp != null){
            
            next = temp.next;
            temp.next = prev;
            
            prev = temp;
            temp = next;
        }
        return prev;
    public static void main(String[] args) {
        Double x = new Double();
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
