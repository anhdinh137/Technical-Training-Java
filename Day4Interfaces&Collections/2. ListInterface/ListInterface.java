import java.util.List;
import java.util.LinkedList;
// The list interface extends the Collection interface and is part of the java.util package
// It is used to store ordered collections where duplicates are allowed and elements can be accessed by their index.
public class ListInterface{
    public static void main(String[] args) {
        // There is 4 common implementation for the list interface
        // LinkedList: implemented using Doubly Linked List, effiecient if there are frequent insertion and deletion
        // ArrayList: using resizable array, effiecient for reading data, less deletion
        // Stack: thread safe but slow
        // Vector: use last in first out 
        List<Integer> list = new LinkedList<>();
        
        // Adding to the list
        list.add(15);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println(list);
        
        // Updating element in the list  
        list.set(2, 200);
        System.out.println(list);

        // Searching element in the list using indexOf(), lastIndexOf()
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));

        // Removing element
        list.remove(2);
        System.out.println(list);

        // Acessing element
        System.out.println(list.get(0));

        // Checking if the element is present or not
        System.out.println(list.contains(15));
        System.out.println(list.contains(25));

        // Iterating over the list

        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        for (int i: list){
            System.out.println(i);
        }
    }
}