package week_5.records;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        //Generate 4 students using record
        Student student1 = new Student("Ali", "Yılmaz", 12345);
        Student student2 = new Student("Ayşe", "Kahraman", 12346);
        Student student3 = new Student("Mehmet", "Yıldırım", 12347);
        Student student4 = new Student("Ali", "Yılmaz", 12345);

        //Add students to a list
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        //Print all students in the list
        for (Student student : studentList) {
            System.out.println(student);
        }

        //Check if equals() method works correctly
        System.out.println((student1.equals(student4) ? "student1 and student4 are same" : "student1 and student4 are NOT same"));
        System.out.println((student2.equals(student3) ? "student2 and student3 are same" : "student2 and student3 are NOT same"));

        //Check if hashCode() method works correctly
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
    }
}
