import java.util.Scanner;

public class TekGirileneKadarCiftVeDordunKatiToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris, toplam = 0;
        do {
            System.out.print("Bir sayı giriniz : ");
            giris = input.nextInt();
            if (giris % 2 == 0 && giris % 4 == 0)
                toplam += giris;
        } while (giris % 2 == 0);
        System.out.println("Sayıların Toplamı : " + toplam);
    }
}
