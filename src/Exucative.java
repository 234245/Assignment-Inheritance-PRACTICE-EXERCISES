public class Exucative extends Manager {


    public Exucative(String name, double salary, String department) {
        super(name, salary, department);  // Call the superclass constructor
    }
    @Override
    public String toString() {
        return super.toString() + ", Executive Role";
    }
}
