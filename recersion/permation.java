 package recersion;
import java.util.*;
public class permation {
    public static void main(String[] args) {
        permation_rec("", "abc");
    }
    static void permation_rec(String p ,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;                                                              // abc
        }                                                                        // 123
        char ch = up.charAt(0);                                     // ch = a
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);                      // f= 
            String s = p.substring(i,p.length());                         // s =
            permation_rec(f+ch+s, up.substring(1));            // 
        }
    }
}
// import java.util.*;
// public class permation {
//     public static void main(String[] args) {
//        System.out.println( permation_ite("", "abc"));
//     }
//     static ArrayList<String> permation_ite(String p ,String up){
//         if (up.isEmpty()) {
//             ArrayList<String> list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }
//         char ch = up.charAt(0);
//         ArrayList<String> ans = new ArrayList<>();
//         for (int i = 0; i <= p.length(); i++) {
//             String f = p.substring(0, i);
//             String s = p.substring(i,p.length());
//          ans.addAll(permation_ite(f+ch+s, up.substring(1)));
//         }
//         return ans;
//     }
// }
