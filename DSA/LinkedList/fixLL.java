package DSA.LinkedList;

public class fixLL {
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
    
        public static void main(String[] args) {
           fixLL x = new fixLL();
            x.insertFirst(10);
            x.insertFirst(20);
            x.insertFirst(30);
            x.insertLast(40);
            x.deleteFirst();
            x.deleteLast();
            x.insertAt(1,30);
            x.display();
        }
    }
    
