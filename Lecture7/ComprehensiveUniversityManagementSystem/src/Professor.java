import java.util.List;
public class Professor implements UniversityMember, Educator, Researcher {
    String id;
    String name;
    private String role = "Professor";
    private List<String> coursesTaught;
    private List<String> researchTopics;

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void teachCourse(String courseName) {

    }

    public void conductResearch(String topic) {

    }
}