public class staticBinding {
    // binding: linking a method call to its method body
    // When a method is called, java must decide which version of the method to execute
    
    // Static binding: resolved at compile time by the compiler(early static/ early binding)
    // Applies to private, final, static methods, method overloading
    public static class Father {
        public static void status(){
            System.out.println("father");
        }

        public void example(int i){
            System.out.println("Int input");
        }
        // Method overloaded
        public void example(String str){
            System.out.println("String input");
        }
    }

    public static class Son extends Father{
        public static void status(){
            System.out.println("son");
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        Father s = new Father();
        Son son = new Son();

        father.status();
        father.example(23);
        s.status();
        son.status();
        // the print method of the superclass is static -> the compiler knows it will not be overridden in subclasses
        // the compiler know what version to run in advance, so no runtime decision is needed
    }   
}
