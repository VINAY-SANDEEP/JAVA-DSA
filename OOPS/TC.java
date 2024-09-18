package OOPS;

import java.util.Scanner;

public class TC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      try {
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x/y);
      } 
      catch (Exception e) {
        System.out.println("nuvvu enter chesindhi tappu ra babu");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x/y);
      }
    }
}
