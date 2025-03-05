import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double height = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double weight = scanner.nextDouble();

        System.out.println("Vücut kitle indeksiniz: " + weight/(height*height));
    }
}
