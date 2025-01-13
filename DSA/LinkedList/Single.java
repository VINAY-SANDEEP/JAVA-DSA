package DSA.LinkedList;
public class Single {
        class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
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
                head = temp;
            }
            size++;
        }
       public void insertLast(int data){
           Node temp = new Node(data);
           if(head==null){
               head = tail = temp; 
           }
           else{
               tail.next = temp;
               tail = temp;
           }
           size++;
       }
        public void deleteFirst(){
            if(head==null){
                System.out.println("Nothing to delete");
                return;
            }
            if(size==1){
                head=tail=null;
            }
            else{
                head=head.next;
            }
            size--;
        }
        public void deleteLast(){
        Node current = head;
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if(size==1){
            head=tail=null;
        }
        else{
            while(current.next!=tail){
                current = current.next;
            }
            current.next =null;
            tail = current;
        }
        size--;
    }
        public void insertAt(int position,int data){
            if(position < 0 || position > size){
                System.out.println("invaild position");
                return;
            }
            if(position == 0){
                insertFirst(data);
                return;
            }
            if(position == size){
                insertLast(data);
                return;
            }
            Node temp = new Node(data);
            Node current = head;
            for(int i = 0 ; i < position-1 ; i++){
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            size++;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
        public void deleteAtPosition(int position) {
            if (position < 1 || position > size) {
                System.out.println("Invalid position. Please provide a position between 1 and " + size);
                return;
            }
            if (position == 1) {
                deleteFirst();
                return;
            }
            if (position == size) {
                deleteLast();
            }
            Node current = head;

            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
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
                    System.out.println("Node with value " + (size-1) +  " found.");
                    return;
                }
                node = node.next;
            }
            System.out.println("Node with value " + value + " not found.");
        }
        public int modularNode(Node head, int k) {
         if (head == null || k <= 0) return -1;
        Node current = head;
        int index = 1;
        int modularNodeValue = -1;
        while (current != null) {
            if (index % k == 0) {
                modularNodeValue = current.data;
            }
            current = current.next;
            index++;
        }
        return modularNodeValue;
    }
        //change array into linkedlist
         public Node constructLL(int arr[]) {
         Node node = new Node(arr[arr.length-1]);
         
        for(int i =arr.length-2;i>=0;i--){
            Node temp = new Node(arr[i]);
            temp.next = node;
            node = temp;        
        }
        return node;
    }
        public static void main(String[] args) {
           Single x = new Single();
            x.insertFirst(10);
            x.insertFirst(20);
            x.insertFirst(30);
            x.insertLast(40);
            x.deleteFirst();
            x.deleteLast();
            x.insertAt(1,30);
             System.out.println(x.get(2));
             x.find(30);
            x.display();
        }
    }
