import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class Comparators {
    // in java.util, used to sort object of user-defined class
    // The comparator object compare 2 object
    // if a < b  then negetive, a > b then positive, a == b then 0

    static class sortById implements Comparator<Employee>{
        // You can sort collection by more than 1 field
        public int compare(Employee a, Employee b){
            if (a.getId() != b.getId()) return a.getId()-b.getId();
            else return a.getAge() - b.getAge();
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        list.add(new Employee(2, "a", 24));
        list.add(new Employee(3, "b", 26));
        list.add(new Employee(1, "c", 31));
        list.add(new Employee(4, "d", 19));

        for (Employee employee: list){
            System.out.println(employee.getId() + " " + employee.getName() + " "+ employee.getAge());
        }

        Collections.sort(list, new sortById());

        for (Employee employee: list){
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge());
        }
    }
}
