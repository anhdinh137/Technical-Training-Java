public class anonymousInnerClass {
    // Anonymous inner classes are declared without any name at all
    // They are created in two ways: 
    //As a subclass of the specified type
    //As an implementer of the specified interface

    // Using the interface
    static interfaceOuter in = new interfaceOuter() {
        public void output(){
            System.out.println("Interface outer");
        }
    };
    // Using subclass
    static Outer sub = new Outer(){
        public void output(){
            super.output();
            System.out.println("Subclass inner class");
        }
    };

    public static void main(String[] args) {
        in.output();
        sub.output();
        
    }
}
