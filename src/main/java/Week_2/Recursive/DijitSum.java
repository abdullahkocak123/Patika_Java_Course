package Week_2.Recursive;

import java.util.Scanner;

public class DijitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        System.out.print("Sum: " + sumDigits(number));
    }

    private static int sumDigits(int input) {
        //1234
        if (input / 10 == 0)
            return input;
        return sumDigits(input / 10) + input % 10;
    }
}
