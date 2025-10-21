import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
    // An interface in the collection framework, part of java.util package and extend map interface
    // Represent a map that contains its key in a sorted order
    // Sorted by natural ordering or Comparator

    public static void main(String[] args) {
        // Similar syntax to map
        SortedMap<Integer, String> smap = new TreeMap<>();

        smap.put(3, "Test 3");
        smap.put(4, "Test 4");
        smap.put(2, "Test 2");
        smap.put(1, "Test 1");

        System.out.println(smap);

        smap.put(2, "Test 20");
        System.out.println(smap);

        smap.remove(2);

        System.out.println(smap);


        for (Map.Entry<Integer, String> entry: smap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
