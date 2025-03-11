package Week_1;

import java.util.Scanner;

public class MinMax2 {

    // 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
    // hesaplayan program (ödev içerisinde bu şekilde farklı bir tanım daha var)

    public static void main(String[] args) {

        //Kullanıcıdan sayı alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        //3 ve 4'e tam bölünen sayılar 12'ye tam bölünen sayılar demektir, mesela;
        //12, 24, 36, 48, 60, ...

        //Verilen sayıya kadar kaç tane 12'nin katı sayı olduğunu buluyoruz;
        int n = (number-1)/12; //sayıya kadar dendiği için o girilen sayıyı dahil etmiyoruz

        //Bu sayıların toplamını(12'ye bölünmüş haliyle) hesaplıyoruz;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
                sum += i;
        }

        //Ortalamayı hesaplıyoruz;
        int average = (12*sum)/n;

        //Sonucu ekrana yazdırıyoruz;
        System.out.println("Sonuç: "+ average);
    }
}
