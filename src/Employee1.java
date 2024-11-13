public class Employee1 {
    private String name;
    private double baseSalary;

    public Employee1(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBaseSalary(double newSalary) {
        this.baseSalary = newSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }
}
