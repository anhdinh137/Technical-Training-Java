import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    // Part of the java.util package, represents a set that maintains its elements in sorted order
    // Same rules as with normal set, but the set will be sorted by key
    public static void main(String[] args) {

        SortedSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);

        numbers.add(3);
        System.out.println( numbers);

        // Removing element
        numbers.remove(2);
        System.out.println(numbers);

        // Accessing first last elements
        System.out.println(numbers.first());
        System.out.println(numbers.last());

        // Getting subsets
        System.out.println( numbers.headSet(4));
        System.out.println( numbers.tailSet(3));
        System.out.println( numbers.subSet(2, 5));

        // Iterating through the set (in sorted order)
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
