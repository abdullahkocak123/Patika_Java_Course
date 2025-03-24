package Week_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NthPrimeNumber_Coderbyte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int input = scanner.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < 120000; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        System.out.println(input + ". Prime Number is: " + primeNumbers.get(input - 1));

    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
