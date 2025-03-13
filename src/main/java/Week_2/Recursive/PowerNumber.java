package Week_2.Recursive;

import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {

        //Get 2 numbers from user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give base number: ");
        int number1 = scanner.nextInt();
        System.out.print("Give the power number: ");
        int number2 = scanner.nextInt();

        //Calculate power result using below method and print:
        System.out.print(number1 + "^" + number2 + " = " + power(number1, number2));
    }

    //Define a method which calculates power of a number in a recursive way
    private static int power(int num1, int num2) {

        /*int result = num1;
        for (int i = 1; i < num2; i++) {
            result *= num1;
        }*/

        if (num2 == 0) {
            return 1;
        }
        return num1 * power(num1, num2 - 1);
    }

}
