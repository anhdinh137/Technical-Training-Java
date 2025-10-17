// Inheritancce: one class inherits the features (field and method) of another class
// Can be achieved by using the extend keyword
public class Student extends People {
    
    // Encapsulation can be seen below, as the process of wrapping method and attribute into a single class
    // eg: using private and public like below
    // Encapsulation act as a protective shield preventing data from being accessed from a class outside
    private int id;
    private String name;
    private float grade;
    // This is a class,a user-defined blue print/ prototype from which objects are created
    // represents the set of properties or methods that are common to all objects of
    // one type

    public Student (int id, String name, float grade){
        // Superclass: The class whose features are inherited is known as superclass
        // Subclass: The class that inherits the other class is known as subclass
        // The subclass can add its own fields and methods in addition to the superclass fields and methods.
        super(id, name);
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Setters and getters
    // Encapsulation can be achieved by declaring all the variables in a class as private
    // and writing public methods in the class to set and get the values of the variables.
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    
    // Method overriding:  method in the child class has the same name, return-type and parameters as in parent class
    // The child class provides the implementation in the method already written.
    @Override
    public void talk(){
        System.out.println("I am a student, my average grade is "+ grade);
    }

    public void status(){
        System.out.println("Student");
    }

}   