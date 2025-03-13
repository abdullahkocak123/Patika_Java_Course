package Week_2.Recursive;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String str = scanner.next();
        System.out.print("Reverse: " + reverse(str));

    }

    private static String reverse(String str) {
        //tepsi
        if (str.length() == 1) {
            return str;
        } else {
            char lastChar = str.charAt(str.length() - 1);
            return lastChar + reverse(str.substring(0, str.length() - 1));
        }
    }
}
