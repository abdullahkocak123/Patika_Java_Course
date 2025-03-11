package Week_1;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {

        //Kullanıcıdan tip dönüşümü yapmak üzere bir tam sayı ve bir ondalıklı sayı alalım;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz: ");
        int tamsayi = scanner.nextInt();
        System.out.print("Lütfen bir ondalıklı sayı giriniz: ");
        double ondalikli = scanner.nextDouble();

        //Tam sayıyı ondalıklı sayıya çevirelim;
        double ondalikli2 = (double) tamsayi;

        //Ondalıklı sayıyı tam sayıya çevirelim;
        int tamsayi2 = (int) ondalikli;

        //Sonuçları ekrana yazdıralım;
        System.out.print("Tam sayının ondalıklı hali: " + ondalikli2);
        System.out.println();
        System.out.print("Ondalıklı sayının tam sayı hali: " + tamsayi2);
    }
}
