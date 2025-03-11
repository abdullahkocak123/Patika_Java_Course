package Week_1;

import java.util.Scanner;

public class GroceryCashier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan ürün türlerinin miktarlarını alıyoruz.
        System.out.print("Armut kaç kilo?: ");
        double armut = scanner.nextDouble();

        System.out.print("Elma kaç kilo? ");
        double elma = scanner.nextDouble();

        System.out.print("Domates kaç kilo? ");
        double domates = scanner.nextDouble();

        System.out.print("Muz kaç kilo? ");
        double muz = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo? ");
        double patlican = scanner.nextDouble();


        //Toplam tutarı hesaplayıp ekrana yazdırıyoruz.
        System.out.print("Toplam Tutar: " + (armut* 2.14  + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5) + " TL");

    }
}
