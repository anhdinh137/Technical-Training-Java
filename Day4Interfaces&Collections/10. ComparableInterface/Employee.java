
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    // Used to define the natural ordering of objects for collections like list,array, sets, aswell as for sorting
    // Implemented inside the class itself, overrding compareTo
    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}