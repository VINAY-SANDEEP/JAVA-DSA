package recersion;
import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
         for (int j = 1; j < i; j++) {
             System.out.print(j);
         }
         System.out.println();
        }
    }
}
// import java.util.*;
//  public class Main {
//     public static void main(String[] args) {
//      System.out.println(pattern(null, 0, 0));
//     }
//     static int[] pattern(int[] arr,int r,int c){
//      if (r==0) {
//         return;
//      }
//      if (c<r) {
//         if (arr[c] > arr[c+1]) {
//             int temp= arr[c];
//             arr[c]=arr[c+1];
//             arr[c+1]=temp;
//         }
//       return pattern(arr, r, c+1);
//      }
//      else {
//       return pattern(arr,r-1,0);
//      }
//     }
//  }



