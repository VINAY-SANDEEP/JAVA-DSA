package OOPS;

 class My_thar extends Thread{
    public void run(){
        try {
           while (true) {
            System.out.println("priya loves vishnu too much");
            Thread.sleep(1000);
           }
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
                }
        } 
    }
public class My_Theards {
 public static void main(String[] args) {
    My_thar t1 = new My_thar();
    t1.start();
    System.out.println("Main thread is running");

 }   
}