public class Interface1Implement implements Interface1 {
    @Override
    public void display1(){
        System.out.println("Interfaces method implement");
    }

    public static void main(String[] args) {
        Interface1Implement i1 = new Interface1Implement();
        Interface2Implement i2 = new Interface2Implement();
        System.out.println(i1.count);
        i1.display1();
        i2.display1();
        i2.display2();
 
    } 
}
