package DSA.Hashs;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapNavigation {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");

        // First and Last keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // Floor and Ceiling keys
        System.out.println("Floor key of 25: " + map.floorKey(25)); // Closest lower or equal
        System.out.println("Ceiling key of 25: " + map.ceilingKey(25)); // Closest higher or equal
        System.out.println("SubMap (20 to 40): " + map.subMap(20, 50));
        System.out.println("HeadMap (<30): " + map.headMap(30));
        System.out.println("TailMap (>=30): " + map.tailMap(30));
          for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
