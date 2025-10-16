public class instanceVariable {
    public static void main(String[] args) {
        // Instance Variable: variable declared inside of a class, outside of a block, method or constructor
        class Instance{
            // Takes default value based on the data types if not initialized
            int id;
            String name;
            // Initialized using constructor
            public Instance(int id, String name){
                this.id = id;
                this.name = name;
            }

            public void printOut(){
                System.out.println("ID: "+ id + " Name: " + name);
            }
        }
        // Scope is throught out the class
        Instance instance = new Instance(123, "water");
        instance.printOut();

        // Can only be accessed through objects of the class
    }
}
