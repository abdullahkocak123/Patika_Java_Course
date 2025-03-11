package Week_1;

import java.util.Scanner;

public class MinMax3 {

    // Girilen sayılardan min ve Max Değerleri bulan program
    // (ödev içerisinde bu şekilde farklı bir tanım daha var)

    public static void main(String[] args) {

        //Kullanıcıdan kaç tane sayı girileceğini öğreniyoruz;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        //Kullanıcıdan sayıları alıyoruz;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        //ilk sayıyı atadığımız min ve max değerlerini diğer sayılarla karşılaştırıp gerekirse değiştiriyoruz;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maksimum değer: " + max);
        System.out.println("Minimum değer: " + min);

    }

}


