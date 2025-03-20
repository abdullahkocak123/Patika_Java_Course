package Week_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Closest2Numbers {
    public static void main(String[] args) {

        //Generating an Arrayist of 10 numbers. We will search for 2 closest number.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(38);
        numbers.add(7);
        numbers.add(75);
        numbers.add(83);
        numbers.add(32);
        numbers.add(21);
        numbers.add(16);
        numbers.add(44);
        numbers.add(65);
        numbers.add(77);

        numbers.sort(Integer::compareTo);
        //Collections.sort(numbers); // Alternative

        //After sorting numbers, calculate differences of one after another. Keep the smallest difference.
        int difference = Integer.MAX_VALUE;
        int number1 = numbers.get(1);
        int number2 = numbers.get(2);
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i + 1) - numbers.get(i) < difference) {
                number1 = numbers.get(i);
                number2 = numbers.get(i + 1);
                difference = numbers.get(i + 1) - numbers.get(i);
            }
        }

        //Print those 2 numbers which have the smallest difference.
        System.out.println("Closest two numbers are: " + number1 + " and " + number2);

    }
}
