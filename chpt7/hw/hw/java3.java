import java.util.ArrayList;

public class School {
    // ArrayList to hold students
    private ArrayList<Student> students;

    // Constructor
    public School() {
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Method to remove a student from the school
    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    // Method to find the youngest student in the school
    public Student findYoungestStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student youngest = students.get(0);
        for (Student student : students) {
            if (student.getAge() < youngest.getAge()) {
                youngest = student;
            }
        }
        return youngest;
    }

    // Method to find the oldest student in the school
    public Student findOldestStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student oldest = students.get(0);
        for (Student student : students) {
            if (student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }
        return oldest;
    }
}
