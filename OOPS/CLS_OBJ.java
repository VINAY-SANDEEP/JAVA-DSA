package OOPS;
// clases it is block of code which we used in a block of a code 
class vishnu{
    // instance varibles
    int age;
    String name;
    float cgpa;
    // constructor it will have two types with parenthesis and without parenthesis it is vallid class name only 
    vishnu(int age ,String name,float cgpa){
        // this keyword is used for the inside the constructor 
        this.age=age;
        this.name=name;
        this.cgpa=cgpa;
    }
    // methods it is a block of code which we used in a class it is your wish to give a name
    void vishnu_details(){
        System.out.println("name is : "+name);
        System.out.println("age is :  "+age);
        System.out.println("cgpa is : "+cgpa);
}
    void priya_details(){
        System.out.println("name is : "+name);
        System.out.println("age is :  "+age);
        System.out.println("cgpa is : "+cgpa);
    }
}
public class CLS_OBJ {
    public static void main(String[] args) {
        // it is object creation method 
        // className  varible = new class()
        vishnu vishnu_d = new vishnu(20,"vishnu",9);
        vishnu priya_d = new vishnu(16, "priya", 10);
        vishnu_d.vishnu_details();
        priya_d.priya_details();
    }
}
