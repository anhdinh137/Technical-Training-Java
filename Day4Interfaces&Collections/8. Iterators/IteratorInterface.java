import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {
    // java.util package
    // used to loop through elements in a collection
    // Works with collections like list, set, map
    // Allows safe removal of elements during iteration
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");

        System.out.println(names);

        // create iterator
        Iterator<String> iterator = names.iterator();


        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // Remove element
            if (name.equals("b")) {
                iterator.remove();
            }
        }

        System.out.println(names);
        Iterator<String> newIterator = names.iterator();
        while (newIterator.hasNext()) {
            System.out.println( newIterator.next());
        }
    }
}
