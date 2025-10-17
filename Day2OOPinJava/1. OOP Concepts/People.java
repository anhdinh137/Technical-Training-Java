abstract public class People {
    // Abstract is the process of hiding the implementation details
    // and only showing the important detail or feature to user

    // In java, abstraction is achieved by using 'interface' or 'abstract'
    int id;
    String name;

    public People(int id, String name){
        this.id = id;
        this.name = name;
    }

    abstract void talk();

    public void introduce(){
        System.out.println("My name is "+ name);
    }
}
