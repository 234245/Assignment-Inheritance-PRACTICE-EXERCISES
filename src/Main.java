public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 2000, "Computer Science");
        Instructor instructor = new Instructor("Dr. Smith", 1980, 85000.50);
        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}
