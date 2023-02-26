import java.util.Scanner;

public class UcVeDordeTamBolunenSayiOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris, sayac = 0, toplam = 0;
        double ortalama;
        System.out.print("Ortalama hesabı için bir sayı giriniz : ");
        giris = input.nextInt();
        for (int i = 0; i <= giris; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması : " + ortalama);
    }
}
