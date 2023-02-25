import java.util.Scanner;

public class UcakBiletFiyatHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas, mesafe, yolculukTipi;
        double mesafeUcret = 0.10, indirimliTutar, normalTutar, gidisDonusIndirim;
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş) : ");
        yolculukTipi = input.nextInt();
        if (mesafe > 0 && yas > 0) {
            normalTutar = mesafe * mesafeUcret;
            if (yolculukTipi == 1) {
                if (yas < 12)
                    System.out.println(normalTutar - (normalTutar * 0.50)+" TL");
                else if (yas > 12 && yas <= 24)
                    System.out.println(normalTutar - (normalTutar * 0.10)+" TL");
                else if (yas > 65)
                    System.out.println(normalTutar - (normalTutar * 0.30)+" TL");
                else
                    System.out.println(normalTutar+" TL");
            }
            if (yolculukTipi == 2) {
                if (yas < 12) {
                    indirimliTutar = normalTutar - (normalTutar * 0.50);
                    System.out.println((indirimliTutar - (indirimliTutar * 0.20)) * 2+" TL");
                } else if (yas > 12 && yas <= 24) {
                    indirimliTutar = normalTutar - (normalTutar * 0.10);
                    System.out.println((indirimliTutar - (indirimliTutar * 0.20)) * 2+" TL");
                } else if (yas > 65) {
                    indirimliTutar = normalTutar - (normalTutar * 0.30);
                    System.out.println((indirimliTutar - (indirimliTutar * 0.20)) * 2+" TL");
                }
                else{
                    System.out.println((normalTutar-(normalTutar*0.20))*2+" TL");
                }

            }
        } else
            System.out.println("Hatalı veri girdiniz !");
    }
}
