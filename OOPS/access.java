// public is used for entire code 
// pravite is used for used for only innerclass file
// default is similar as pravite but it only acess on the entire the package 
// protected is a same deafult modifier but is used in the but exits a inheritance concept 
package OOPS;
// class name must be public
public class access {
    int roll =101;
    //public constructor
  public access(){
     roll = 102;
    }
    //public method
    public void printRoll(){
        System.out.println(roll);
    }
    //private method this private class should not be access in another class file
    private void abc(){
        printRoll();
        System.out.println(roll);
    }
    public static void main(String[] args) {
        access obj = new access();
        System.out.println(obj.roll);
        obj.printRoll();
    }
}
