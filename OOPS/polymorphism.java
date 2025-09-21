package OOPS;
// to create so many methods to one name is called the method overloading
public class polymorphism {
    //to create a function it is used changed the paranthesis
    public void add(int a,int b){
       System.out.println(a+b);
    }
    // it does not depend upon the name which we provide 
    public void add(int a,int b , int c){
      System.out.println(a+b+c);
    }
    //it is does not contain the varibles also
    public void add(String name,int age){
        System.out.println(name+" is "+age+" years old");
    }
    public static void main(String[] args) {
        //to create a function to create a object 
        polymorphism p = new polymorphism();
        p.add(10,20);
        p.add(10,20,30);
        p.add("Rahul",25);
    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;  
        a = new Dog(); 
        a.sound(); // Dog barks

        a = new Cat();
        a.sound(); // Cat meows
    }
}
