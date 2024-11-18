public class Main {
    public static void main(String[] args) {
        //  Employee object
        Employee employee = new Employee("John Doe", 50000);

        // Manager object
        Manager manager = new Manager("Jane Smith", 75000, "Sales");

        //exucative object
        Exucative executive = new Exucative("Alice Johnson", 120000, "Marketing");


        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());
    }
}
