import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterface {
    // The Collection interface is part of the java.util package
    // root interface of the Java Collections Framework (superinterface of List, Set, Queue)
    // Provides general methods for adding, removing, and checking elements

    // Very similar to list/set/array

    public static void main(String[] args) {
        // Using ArrayList (which implements Collection interface)
        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // check if element exist
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // size
        System.out.println("Total elements: " + fruits.size());

        // iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Converting to array
        Object[] array = fruits.toArray();
        System.out.println("\nConverted to array:");
        for (Object fruit : array) {
            System.out.println(fruit);
        }

        // Clearing all elements
        fruits.clear();
        System.out.println("\nAfter clearing: " + fruits);
        System.out.println("Is collection empty? " + fruits.isEmpty());
    }
}
