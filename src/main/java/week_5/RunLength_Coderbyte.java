package week_5;

import java.util.*;

public class RunLength_Coderbyte {

    public static void main(String[] args) {

        System.out.print("Give a word to be runLength: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //wwwbbbw
        StringBuilder output = new StringBuilder();
        output.append(1);
        output.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == output.charAt(output.length() - 1)) {

                output.setCharAt(output.length() - 2, (char) (output.charAt(output.length() - 2) + 1));
                /* Same usage as above
                char lastChar = output.charAt(output.length()-2);
                int lastInteger = (int) lastChar +1;
                output.setCharAt(output.length()-2, (char) lastInteger);
                 */

            } else {
                output.append(1);
                output.append(input.charAt(i));

            }

        }

        System.out.println(output);

    }

}
