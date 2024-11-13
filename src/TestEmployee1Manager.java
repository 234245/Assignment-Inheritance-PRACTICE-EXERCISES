public class TestEmployee1Manager {
    public static void main(String[] args) {

        Employee1 employee = new Employee1("Alice", 50000);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());

        // Create a Manager object
        Manager manager = new Manager("Bob", 70000, 10000);
        System.out.println("\nManager Name: " + manager.getName());
        System.out.println("Manager Base Salary: " + manager.getSalary());
        manager.setBonus(15000); // Update the bonus
        System.out.println("Manager Salary after bonus adjustment: " + manager.getSalary());
    }
}
