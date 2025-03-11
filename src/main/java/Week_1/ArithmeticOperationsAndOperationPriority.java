package Week_1;

import java.util.Scanner;

public class ArithmeticOperationsAndOperationPriority {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int firstNumber = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int thirdNumber = scanner.nextInt();

        int result = firstNumber + secondNumber * thirdNumber - secondNumber;

        System.out.println("a+b*c-b işlem sonucu: " + result);
    }
}
