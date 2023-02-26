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

        /* 1-999 arası Armstrong Sayıları Bulan Program
        int sayi=999,geciciSayi=sayi,basamakSayisi=0,basamakDegeri,basamakUs,toplam;

        while(geciciSayi!=0){
            geciciSayi/=10;
            basamakSayisi++;
        }
        for (int i=999;i>=0;i--){
            toplam=0;
            geciciSayi=i;
            while (geciciSayi!=0){
                basamakDegeri=geciciSayi%10;
                basamakUs=1;
                for (int j=1;j<=basamakSayisi;j++)
                    basamakUs*=basamakDegeri;
                toplam+=basamakUs;
                geciciSayi/=10;
            }
            if(toplam==i)
                System.out.println(toplam+" Armstrong Sayıdır");
        }*/

    }
}
