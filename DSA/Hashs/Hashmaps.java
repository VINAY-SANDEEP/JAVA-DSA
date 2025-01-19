import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
 public static void main(String[] args) {
    // Create a HashMap
    HashMap<String, Integer> map = new HashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    map.put("Four", 4);
    map.put("Five", 5);
    System.out.println(map);
    System.out.println(map.containsKey("One"));
    System.out.println(map.containsValue(1));
    System.out.println(map.hashCode());
    System.out.println(map.isEmpty());
    System.out.println(map.get("One"));
    System.out.println(map.entrySet());
    System.out.println(map.keySet());
    System.out.println(map.values());
    System.out.println(map.size());
    System.out.println(map.replace("One", 1, 100));
    System.out.println(map);
 }   
}
