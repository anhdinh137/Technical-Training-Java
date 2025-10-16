public class nonPrimitive {
    public static void main(String[] args) {
        // Non primitive (reference) data types: contain a pointer to the memory, does not directly contain the value
        // Stored on the heap

        // Non primitive include String, Array, Class, Object, Interface
        // String: A non-primitive given by Java
        String str = "hello world";
        System.out.println(str);
        // Array
        int[] i = {1,2,3,4,5};
        for (int a: i){
            System.out.println(a);
        }
        // Class
        class People {
            int id;
            String name;

            public People(int id, String name){
                id = this.id;
                name = this.name;
            }

            public void printOut(){
                System.out.println("ID: "+ id + " Name: "+ name);
            }
        }
        // Interface
        interface animal {
            void talk();
        }
        class whales implements animal{
            public void talk(){
                System.out.println("ah");
            }
        }
        //Object

        People people = new People(0, "Will");
        people.printOut();
    }
}
