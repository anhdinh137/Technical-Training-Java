import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    // Part of the java.util package, represent a collection of key-value pair
    // Key are unique, values can be dupes
    // Hashmap, Linkedlistmap allow one null key, treemap does not
    public static void main(String[] args) {
        // Can also use LinkedHashMap or TreeMap
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pair to the map
        map.put(1, "abc");
        map.put(2,"def");
        map.put(3, "ghy");
        System.out.println(map);

        // updating element
        map.put(2, "win");
        System.out.println(map);

        // removing element
        map.remove(2);
        System.out.println(map);

        // iterating through the map

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
