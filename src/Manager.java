public class Manager extends Employee1{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);  // Call the superclass (Employee) constructor
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus; // Salary is baseSalary + bonus
    }
}
