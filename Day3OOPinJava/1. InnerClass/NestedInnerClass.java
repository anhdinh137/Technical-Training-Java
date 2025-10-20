public class NestedInnerClass {

    class Main {
        public static void main(String[] args) {
            // It can access any private instance variable of the outer class   
            Outer.Inner in = new Outer().new Inner();

            in.output();
        }
    }

}
