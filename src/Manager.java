public class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String department) {
        super(name, salary);  // Call the superclass constructor
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}
