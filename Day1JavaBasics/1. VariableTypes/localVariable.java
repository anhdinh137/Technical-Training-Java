public class localVariable {
    public static void main(String[] args) {
        // Local variable: a variable defined within a block, constructor, method
        // Local variable is created and destroyed within the same block when the function complete running
        // Scope the local variable is only accessable in the block that it is declared in
        // Local variable needs to be initialized before being used

        //Example 1: using a local variable
        int local = 5;
        System.out.println(local);

        // Example 2: variable current cannot be used outside of this for statement
        for (int i = 0 ; i < 5; i++){
            String current = "Loop " + i;
            System.out.println(current);
        }
        // Only accessable within the block its declared in (which is the for loop)

        // Ruuning the line below will result in error
        // System.out.println(current);
    }
}
