package OOPS;
public class encapsulation {
 private   int roll;
private String name;
private boolean isattend;
    //constructor
    encapsulation(int roll){
     this.roll=roll;
    }
    void studentattend(boolean flag){
        if (!isattend) {
            isattend=flag;
        }
        System.out.println("teacher assigned attendence");
    }
     boolean studentassign(){
    System.out.println("student assigned attendence");
     return isattend;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIsattend(boolean isattend) {
        this.isattend = isattend;
    }
    public static void main(String[] args) {
        encapsulation obj=new encapsulation(21);
        System.out.println(obj.name);
        System.out.println(obj.roll);
        System.out.println(obj.isattend=true);
        obj.studentattend(true);
       obj.studentassign();
    }
}
