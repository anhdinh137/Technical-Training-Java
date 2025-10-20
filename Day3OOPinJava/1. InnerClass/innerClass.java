public class innerClass {
    // In java, an inner class is defined within another class or interface.

    class Inner{
        void out(){
            System.out.println("This is inner class");
        }
    }

    public static void main(String[] args) {
        innerClass outer = new innerClass();
        innerClass.Inner inner = outer.new Inner();
        inner.out();
    }
}
