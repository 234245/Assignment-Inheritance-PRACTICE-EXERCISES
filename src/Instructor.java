public class Instructor extends person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);  // Call the superclass constructor
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + salary;
    }
}
