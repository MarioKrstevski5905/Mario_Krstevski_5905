import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", studentId='" + studentId + '\'' + '}';
    }
}

class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student("Alice", 20, "S001");
        Student s2 = new Student("Bob", 22, "S002");

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.printAllStudents();

        manager.removeStudent("S001");

        System.out.println("After removal:");
        manager.printAllStudents();

        Student foundStudent = manager.findStudent("S002");
        System.out.println("Found: " + foundStudent);
    }
}