public class Outer {
    
    public void output(){
        System.out.println("Normal output");
    }

    private static void staticMethod(){
        System.out.println("Static void outer method");
    }
    
    // It can access any private instance variable of the outer class   
    class Inner{
        void output(){
            System.out.println("Outer.Inner");
        }
    }

    public void outerMethod(){
        // Inner class can be declared within a method of an outer class 
        class Inner2{
            void innerMethod(){
                System.out.println("Local Inner Class method");
            }
        }
        
        Inner2 inner = new Inner2();
        inner.innerMethod();
    }

     // A static class defined inside another class
    static class Inner3 {
        static void output(){
            staticMethod();
            System.out.println("Inner static class");
        }
    }
}
