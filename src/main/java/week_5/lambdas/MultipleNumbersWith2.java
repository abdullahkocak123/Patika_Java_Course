package week_5.lambdas;

import java.util.ArrayList;
import java.util.List;

public class MultipleNumbersWith2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Using lambda instead of standard for loops; both multiplying by 2 and printing numbers
        numbers.forEach(number -> System.out.println(number * 2));

    }
}
