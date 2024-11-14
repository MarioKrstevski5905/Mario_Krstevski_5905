public class StaffMember implements UniversityMember, Administrator {
    String id;
    String name;
    private String role = "Staff Member";
    private String departmentName;

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void manageDepartment(String departmentName) {

    }
}