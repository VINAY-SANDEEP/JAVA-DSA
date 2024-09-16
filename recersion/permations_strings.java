package recersion;
import java.util.*;
public class permations_strings {
  public static void main(String[] args) {
    skip("","baccdah");   
  }
  static void skip(String p,String up){
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0); 
    if (ch == 'a') {              
      skip(p, up.substring(1));   
    }
    else{
      skip(p+ch, up.substring(1)); 
    }
  }
}
//..................................................................................................................................
//..................................................................................................................................
//...................................................................................................................................
// import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//  System.out.println(skip("bappledah"));
//   }
//   static String skip(String up){
//     if (up.isEmpty()) {
//       return " ";
//     }    
//     if (up.startsWith("apple")) {            
//     return skip(up.substring(5));   
//     }
//     else{
//       return up.charAt(0) + skip(up.substring(1));  
//     }
//   }
// }
//  import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//  subsequence("","abc");
//   }
//   static void subsequence(String p,String up){
//     if (up.isEmpty()) {          
//         System.out.println(p);
//         return;
//     }     
//      char ch=up.charAt(0);                         
//      subsequence(p+ch, up.substring(1));      
//      subsequence(p, up.substring(1));           
//   }
// }
// import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//     System.out.println(subsequence("","abc"));
//   }
//   static ArrayList<String> subsequence(String p,String up){
//     if (up.isEmpty()) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add(p);
//         return list;
//     }    
//      char ch=up.charAt(0);
//   ArrayList<String> left=subsequence(p+ch, up.substring(1));
//   ArrayList<String> right =subsequence(p, up.substring(1));
//   left.addAll(right);
//   return left;
//   }
// }
// import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//  subsequence("","abc");
//   }
//   static void subsequence(String p,String up){
//     if (up.isEmpty()) {
//         System.out.println(p);
//         return;
//     }    
//      char ch=up.charAt(0);
//      subsequence(p+ch, up.substring(1));
//      subsequence(p, up.substring(1));
//      subsequence(p+(ch+0), up.substring(1));
//   }
// }
