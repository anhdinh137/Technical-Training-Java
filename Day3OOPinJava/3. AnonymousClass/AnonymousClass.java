public class AnonymousClass {
    // Already discussed in the inner class section
    
    // Anonymous inner classes are declared without any name at all. 
    // Created in 2 ways:
    // As a subclass of the specified type
    // As an implementer of the specified interface
    
    static interfaceCla interf = new interfaceCla() {
        public void display(){
            System.out.println("Anonymous interface method");
        }
    };

    static AnonClass anon = new AnonClass(){
        public static void display(){
            System.out.println("Anonymous class method");
        }
    };    

    public static void main(String[] args) {
        interf.display();
        anon.display();
    }
}
