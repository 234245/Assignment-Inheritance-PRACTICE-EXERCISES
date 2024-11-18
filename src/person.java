public class person {
    private String name;
    private int yearOfBirth;
    public person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}
