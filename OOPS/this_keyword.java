class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        // 'this' refers to the current object's instance variables
        this.id = id;
        this.name = name;
    }

    // Method to display student info
    void display() {
        System.out.println("ID: " + this.id); // 'this' is optional here
        System.out.println("Name: " + this.name);
    }

    // Another constructor calling the first constructor using 'this'
    Student() {
        this(101, "Default Name"); // calls the parameterized constructor
        System.out.println("Default constructor called");
    }

    // Method calling another method using 'this'
    void showInfo() {
        this.display(); // calling current class method
    }
}

public class this_keyword {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vinay");
        s1.display();

        System.out.println();

        Student s2 = new Student(); // calls default constructor
        s2.showInfo();
    }
}
