import java.util.List;
public class Student implements UniversityMember, Learner {
    String id;
    String name;
    private String role = "Student";
    private List<String> coursesEnrolled;

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void attendClass(String courseName) {

    }
}