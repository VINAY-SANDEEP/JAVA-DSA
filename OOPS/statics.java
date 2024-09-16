package OOPS;

import java.util.Random;

public class statics {
    static int number;
     // static block which excutes first after main method
    static{
        System.out.println("static block");
    }
     //non-static block which excutes first main method after non static
    {
        System.out.println("non-static block ");
    }
    public static void main(String[] args) {
      // it is static method which we don't want to create an object
        number = new Random().nextInt(6);
        number = new Random().nextInt(6);
        number = new Random().nextInt(6);
       System.out.println(number);
       System.out.println(number);
       System.out.println(number);
       //it is a static method we don't have to create an object to call with class name
       pakages.print();
       //it is a non-static method we have to create an object to call
       pakages x = new pakages();
       x.print2();
    }
}
