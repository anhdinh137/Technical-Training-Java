import java.util.LinkedList;
import java.util.List;

public class wrapperClass {
    // Example of wrapper classes
    public static void main(String[] args) {
        // A Wrapper class in java is one whose object wraps or contains primitive data types
        int a = 10;
        // When we create an object in a wrapper class, it contains a field and in this field, we can store primitive data types
        Integer b;

        // Wrapping primitive int into wrapper Integer
        b = a;
        // This is auto boxing, The automatic conversion of primitive types to the object of their corresponding wrapper classes
        System.out.println(b);
        System.out.println(a);

        List<Integer> list = new LinkedList();
        list.add(25);
        // Auto boxing int 25 to Integer
        System.out.println(list.get(0));

        // unboxing is the opposite, converting a object of wrapper class to its primitive class
        Character ch= 'a';
        char c = ch;
        System.out.println(c);
    }
}
