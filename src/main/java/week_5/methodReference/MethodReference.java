package week_5.methodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        //Classic approach to print names in the list:
        /*for (String name: names){
            System.out.println(name);
        }
         */

        //Method Reference to print same list:
        names.forEach(System.out::println);
    }
}
