import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {
        List<Employee> employee = new LinkedList<>();
        employee.add(new Employee(1, "a"));
        employee.add(new Employee(3, "b"));
        employee.add(new Employee(2, "c"));
        employee.add(new Employee(4, "d"));

        for (Employee e : employee) {
            System.out.println(e.getId() + " " + e.getName());
        }

        Collections.sort(employee);

        for (Employee e : employee) {
            System.out.println(e.getId() + " " + e.getName());
        }
    }
}
