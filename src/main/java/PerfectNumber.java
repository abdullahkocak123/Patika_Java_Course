import java.util.Scanner;

public class PerfectNumber {

    //Girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
    // ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan program

    public static void main(String[] args) {

        //Kullanıcıdan sayı alıyoruz;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;

        //Mükemmel sayı olup olmadığını kontrol ediyoruz;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
