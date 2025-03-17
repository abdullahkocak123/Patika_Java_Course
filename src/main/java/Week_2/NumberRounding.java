package Week_2;

import java.util.Scanner;

public class NumberRounding {

    public static void main(String[] args) {

        //Getting a decimal number from user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ondalıklı bir sayı giriniz: ");
        double number = scanner.nextDouble();

        //Printing; round down, round up and round to the closest integer
        System.out.println("Aşağı Yuvarlama: " + (int) Math.floor(number));
        System.out.println("Yukarı Yuvarlama: " + (int) Math.ceil(number));
        System.out.println("En Yakın Tam Sayı: " + Math.round(number));
    }
}
