public class Interface2Implement implements interface2, Interface1 {
    // Multiple inheritance: Interface2Implement implement both interface1 and interface2
    @Override
    public void display1(){
        System.out.println("Display interface 1");
    }

    @Override
    public void display2(){
        System.out.println("Display interface 2");
    }
}
