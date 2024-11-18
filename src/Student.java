public class Student extends person {
    private String major;
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);  // Call the superclass constructor
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
