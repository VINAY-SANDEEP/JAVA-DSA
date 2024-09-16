//this is known as pakages
package OOPS;

import java.util.*;
public class pakages {
   int number;
    public static void main(String[] args) {
 //non-static method it use to create an object in a inner body 
       pakages t1 = new pakages();
       t1.number = new Random().nextInt(6);
       pakages t2 = new pakages();
       t2.number = new Random().nextInt(6);
       pakages t3 = new pakages();
       t3.number = new Random().nextInt(6);
       System.out.println(t1.number);
       System.out.println(t2.number);
       System.out.println(t3.number);
       
    }
    // it is a static method it is used for the create function
    public static void print(){
        System.out.println("static method");
    }
    //it is a non-static method it is used for the create function
    public void print2(){
        System.out.println("non-static method");
    }
}
