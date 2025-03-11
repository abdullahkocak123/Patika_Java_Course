package Week_1;

import java.util.Scanner;

public class InvertedTriangle {

    //Basamak sayısının kullanıcıdan alan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen
    // çizen program

    public static void main(String[] args) {

        //Kullanıcıdan basamak sayısı alıyoruz;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int number = scanner.nextInt();

        for (int i = number; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            if (i!=1) {
                System.out.println();
            }
        }
    }
}
