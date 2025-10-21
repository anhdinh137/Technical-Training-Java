import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    // Part of the java.util package, represents a collection of unique elements
    // Does not allow duplicate elements
    // HashSet, LinkedHashSet allow one null element; TreeSet does not
    // Order of elements depends on implementation:
    // HashSet: no guaranteed order
    // LinkedHashSet: maintains insertion order
    // TreeSet: sorts elements in natural order (or custom Comparator)
    public static void main(String[] args) {
        // Can also use LinkedHashSet or TreeSet
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        System.out.println(set);

        // add duplicate element
        set.add("banana");
        System.out.println(set);

        // Removing element
        set.remove("apple");
        System.out.println(set);

        // Check if element exists
        System.out.println( set.contains("cherry"));
        System.out.println(set.contains("apple"));

        // Iterating through the set
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
