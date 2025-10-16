public class instanceVariable {
    public static void main(String[] args) {
        class Instance{
            int id;
            String name;

            public Instance(int id, String name){
                this.id = id;
                this.name = name;
            }

            public void printOut(){
                System.out.println("ID: "+ id + " Name: " + name);
            }
        }

        Instance instance = new Instance(123, "water");
        instance.printOut();
    }
}
