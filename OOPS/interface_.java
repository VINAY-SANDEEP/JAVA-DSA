package OOPS;
// Define an interface
interface Animal {
    void eat(); // Method without a body
    void sleep();
}
// Implementing the interface in a class
class Dog implements Animal {
    // Providing implementation for the methods
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

public class interface_ {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Output: Dog is eating.
        dog.sleep(); // Output: Dog is sleeping.
    }
}

