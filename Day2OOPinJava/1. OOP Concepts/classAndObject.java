public class classAndObject {

    // 4 core values in java OOP: Polymorphism, Abstraction, Inheritance, Encapsulation
    public static void main(String[] args) {
        // This is an object representing the Student class
        // Object consist of:
        // States: represented by attribute of the object, eg: student.name
        // Behaviour: represented by method of an object
        // Identity: a unique name given to that objects
        Student student = new Student(1, "jar",70);
        student.talk();
        student.introduce();

        Student stu = new Preschooler(0, "Mark", 0, 100);
        stu.status();
    }
}
