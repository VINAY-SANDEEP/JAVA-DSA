package OOPS;
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void sound();
  // Regular method
  public void sleep() {
      System.out.println("This animal is sleeping.");
  }
}
class Dog extends Animal {
  // Providing implementation for the abstract method
  public void sound() {
      System.out.println("The dog barks.");
  }
}
public class abstraction{
  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.sound(); // Outputs: The dog barks.
      dog.sleep(); // Outputs: This animal is sleeping.
  }
}
