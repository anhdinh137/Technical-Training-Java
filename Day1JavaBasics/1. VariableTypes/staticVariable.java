public class staticVariable {
    static String staticTest = "Static String testing";
    // Can be accessed anywhere from the class
    // And shared for all objects of its class and remains for the entire lifetime of the program
    public static void main(String[] args) {
        System.out.println(staticTest);
    }
}
