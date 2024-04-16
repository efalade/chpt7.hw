public class Student {
    // Properties
    private int id;
    private int age;
    private double gpa;
    private int creditHoursAccomplished;

    // Constructors
    public Student(int id, int age, double gpa, int creditHoursAccomplished) {
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.creditHoursAccomplished = creditHoursAccomplished;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHoursAccomplished() {
        return creditHoursAccomplished;
    }

    public void setCreditHoursAccomplished(int creditHoursAccomplished) {
        this.creditHoursAccomplished = creditHoursAccomplished;
    }
}
