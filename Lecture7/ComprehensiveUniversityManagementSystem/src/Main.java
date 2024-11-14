public class Main{

    public static void main(String[] args) {
        Student student = new Student();
        student.id  = "S001";
        student.name = "Alice Smith";

        Professor professor = new Professor();
        professor.id = "P001";
        professor.name = "Dr. John Doe";

        DepartmentHead departmentHead = new DepartmentHead();
        departmentHead.id = "H001";
        departmentHead.name = "Dr. Emily Johnson";

        StaffMember staffMember = new StaffMember();
        staffMember.id = "A001";
        staffMember.name = "Mr. Mark Brown";

        student.attendClass("Mathematics 101");
        professor.teachCourse("Physics 101");
        professor.conductResearch("Quantum Mechanics");
        departmentHead.manageDepartment("Physics Department");
        staffMember.manageDepartment("Administration");

        System.out.println(student.getID() + " " + student.getName() + " " + student.getRole());
        System.out.println(professor.getID() + " " + professor.getName() + " " + professor.getRole());
        System.out.println(departmentHead.getID() + " " + departmentHead.getName() + " " + departmentHead.getRole());
        System.out.println(staffMember.getID() + " " + staffMember.getName() + " " + staffMember.getRole());
    }
}