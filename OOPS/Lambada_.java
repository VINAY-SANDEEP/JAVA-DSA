package OOPS;
import java.util.*;
// Functional interface
@FunctionalInterface
interface Square {
    int calculate(int number);
}
@FunctionalInterface
interface Adder {
    int add(int a, int b);
}
@FunctionalInterface
interface Printer {
    void print();
}
public class Lambada_ {
    public static void main(String[] args) {
        // Lambda expression
        Square square = (number) -> number * number;
        System.out.println("Square of 5: " + square.calculate(5));

         List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        Adder adder = (a, b) -> a + b;
        System.out.println("Sum of 5 and 3: " + adder.add(5, 3));
    
        Printer printer = () -> System.out.println("Printing...");
        printer.print();
    }
}

