import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan boy değerini alıyoruz.
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double height = scanner.nextDouble();

        //Kullanıcıdan kilo değerini alıyoruz.
        System.out.print("Lütfen kilonuzu giriniz: ");
        double weight = scanner.nextDouble();

        //"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırıyoruz.
        System.out.println("Vücut kitle indeksiniz: " + weight/(height*height));
    }
}
