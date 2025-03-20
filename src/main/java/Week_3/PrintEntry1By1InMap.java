package Week_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintEntry1By1InMap {
    public static void main(String[] args) {

        //Generate a Map with 5 entries: students and scores
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ali", 85);
        students.put("Ayşe", 92);
        students.put("Mehmet", 78);
        students.put("Zeynep", 90);
        students.put("Burak", 88);

        //Print each student & score pair in one line
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " = " + student.getValue());
        }
    }
}
