package week_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*Method which we get sum of all numbers in the given string:
i.e. 12kjsf12 -> 24
     jhs 45kh hu4 -> 49
 */

public class NumberAddition_Coderbyte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a statement: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();

        String output = input + "x"; //To prevent getting outofboundsException error, add a non integer character to end.

        for (int i = 0; i < output.length() - 1; i++) {
            if (Character.isDigit(output.charAt(i))) {
                while (Character.isDigit(output.charAt(i))) {
                    sb.append(output.charAt(i));
                    i++;
                }
                numbers.add(Integer.parseInt(sb.toString()));
                sb.setLength(0);
            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }

        System.out.println(sum);
    }
}
