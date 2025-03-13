package Week_2.Recursive;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //Take a number from user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        //Use below isPrime method to check if given number is Prime or not, also print result:
        System.out.println(isPrime(input, input - 1) ? input + " is a Prime number" : input + " is NOT a Prime number");

    }

    //Make a method to check division result is zero or not
    private static boolean isPrime(int number, int divider) {

        if (divider == 1) // break point for infinite loop
            return true;

        if (number % divider == 0) // check point for NOT being Prime
            return false;

        return isPrime(number, divider - 1); // continue checking...

    }
}
