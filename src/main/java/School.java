import com.revoquest.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(1, "Rajesh", "Chagnati", "M", Boolean.TRUE);
        Student s2 = new Student(2, "Kim", "Tim", "F", Boolean.FALSE);
        Student s3 = new Student(3, "Tom", "Jerry", "M", Boolean.FALSE);
        Student s4 = new Student(4, "Jack", "Jill", "F", Boolean.TRUE);
        Student s5 = new Student(5, "Hush", "Puppies", "F", Boolean.FALSE);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(new Student(6, "Jack", "Jones", "F", Boolean.FALSE));
        for ( Student names  : students){
            System.out.println(names.getFirstName());
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        students.stream().map(Student ::getLastName).forEach(lastName -> System.out.println(lastName));

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
        List<String> studentsNotPaidFee = students.stream()
                .filter(s -> (s.getFeePaid().equals(Boolean.FALSE)))
                .map(Student::getFirstName)
                .collect(Collectors.toList());
        studentsNotPaidFee.stream().forEach(System.out::println);



    }
}
