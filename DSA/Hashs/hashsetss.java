import java.util.HashSet;

public class hashsetss {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        System.out.println(set.isEmpty()); // is empty
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        // second set 
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set); // [1,2,3,4,5]
        System.out.println(set.contains(3));//true
        System.out.println(set.clone());//clone 
        System.out.println(set.equals(set1));// set==set2
        System.out.println(set.hashCode());// 1 + 2 + 3 + 4 + 5 = 15
        System.out.println(set.remove(4)); // remove
        System.out.println(set.addAll(set1));//without using forloop to add
       // System.out.println(set.removeAll(set1)); // remove all
        System.out.println(set.size());//return size;
        System.out.println(set.getClass()); // address
        System.out.println(set.iterator());
    }
}
