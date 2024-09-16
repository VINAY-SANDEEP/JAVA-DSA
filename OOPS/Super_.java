package OOPS;
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}
class Dog extends Animal {
    Dog() {
        super();  // Calls the constructor of Animal
        System.out.println("Dog constructor called");
    }
}
// these are the methods
class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        super.sound();  // Calls the parent class method
        System.out.println("Dog barks");
    }
}
//super vs non-super
class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;

    void showValues() {
        System.out.println("Child value: " + value);  // Child class variable
        System.out.println("Parent value: " + super.value);  // Parent class variable
    }
}
// method calling 
class Animal2 {
    Animal2(String name) {
        System.out.println("Animal: " + name);
    }
}

class Dog2 extends Animal2 {
    Dog2(String name) {
        super(name);  // Calls parent class constructor with the argument
        System.out.println("Dog: " + name);
    }
}

public class Super_ {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog.sound();
        // Child child = new Child();
        // child.showValues();
      //  Dog dog = new Dog("Bulldog");
    }
}

