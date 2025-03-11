package Week_1;

import java.util.Scanner;

// Kullanıcının girdiği sayıya kadar çift olan sayıları bulan program
// (ödev içersinde bu şekilde farklı bir tanım daha var)

public class MinMax1 {
    public static void main(String[] args) {

        //kullanıcıdan sayı alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        //Çift sayıları bulup ekrana yazdırıyoruz
        int ciftsayi = 2;
        while (ciftsayi < number) {
            System.out.println(ciftsayi);
            ciftsayi += 2;
        }
    }
}
