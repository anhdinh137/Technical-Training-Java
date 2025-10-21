import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection {
    // The Collections class is a utility class
    // provides static methods to operate on or return collections (like List, Set, etc.)
    // used for sorting, reversing, shuffling, finding min/max, filling, copying, etc.

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);

        System.out.println(list);

        // sort in asc
        Collections.sort(list);
        System.out.println(list);

        // sort in desc
        Collections.sort(list, Collections.reverseOrder());
        System.out.println( list);

        // reversing the list
        Collections.reverse(list);
        System.out.println(list);

        // Shuffling the list
        Collections.shuffle(list);
        System.out.println( list);

        // find max and min
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        // replacing all with specific value

        Collections.fill(list , 25);
        System.out.println(list);
    }
}
