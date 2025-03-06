import java.util.Scanner;

public class FlightTicketCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan mesafe değerini alıyoruz.
        System.out.print("Mesafeyi km türünden giriniz: ");
        double mesafe = scanner.nextDouble();

        //Kullanıcıdan yaş değerini alıyoruz.
        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        //Kullanıcıdan yolculuk tipini alıyoruz.
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        //Normal tutarı hesaplıyoruz.
        double normalTutar = mesafe * 0.1;

        //İndirimli tutarı hesaplıyoruz.
        if (mesafe <= 0 || yas <= 0 || !((yolculukTipi == 1 || (yolculukTipi == 2)))) {
            System.out.println("Hatalı veri girdiniz !");
        } else {
            if (yas < 12) {
                normalTutar *= 0.5;
            }
            if (12 <= yas && yas <= 24) {
                normalTutar *= 0.9;
            }
            if (yas >= 65) {
                normalTutar *= 0.7;
            }
            if (yolculukTipi == 2) {
                normalTutar *= 1.6;
            }

            //Toplam tutar sonucunu ekrana yazdırıyoruz.
            System.out.println("Toplam Tutar = " + normalTutar + " TL");
        }

    }
}
