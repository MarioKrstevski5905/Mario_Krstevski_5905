import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static Student createStudent(String name,int age, int indexNum){
        return new Student(name,age,indexNum);
    }
    public static void printData(Student s){
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("IndexNum: " + s.getIndexNum());
    }
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ana","Barbara","Cname","Petra");
        Random random = new Random();
        nameList.stream().map(name-> createStudent(name, (random.nextInt(12) + 18), (random.nextInt(10000 - 1) + 1) )).forEach(student -> printData(student));
        List<Student> students = nameList.stream().map(name-> createStudent(name, (random.nextInt(12) + 18), (random.nextInt(10000 - 1) + 1) )).collect(Collectors.toList());
        List<Student> studentResult = students.stream().filter(student -> student.getName().startsWith("P")).collect(Collectors.toList());
        studentResult.stream().forEach(student -> printData(student));

        System.out.println("Check if all students are older have age less than 25: " +  students.stream().allMatch(student -> student.getAge() <=25433));
    }
}