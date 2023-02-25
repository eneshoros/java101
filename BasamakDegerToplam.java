import java.util.Scanner;

public class BasamakDegerToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, geciciSayi, basamakSayisi = 0, basamakDegeri, toplam = 0;
        System.out.print("Basamak değerleri toplanacak sayı : ");
        sayi = input.nextInt();
        geciciSayi = sayi;
        while (geciciSayi != 0) {
            basamakSayisi++;
            geciciSayi /= 10;
        }
        for (int i = 1; i <= basamakSayisi; i++) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Toplam : " + toplam);
    }
}
