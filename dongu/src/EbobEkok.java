import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, kucukSayi, ebob = 0, sayac = 1;
        System.out.print("Sayı 1 : ");
        sayi1 = input.nextInt();
        System.out.print("Sayı 2 : ");
        sayi2 = input.nextInt();
        kucukSayi = sayi1 < sayi2 ? sayi1 : sayi2;
        while (kucukSayi > 0) {
            if (sayi1 % kucukSayi == 0 && sayi2 % kucukSayi == 0) {
                ebob = kucukSayi;
                break;
            }
            kucukSayi--;
        }
        System.out.println(sayi1 + " ve " + sayi2 + " EBOB'u : " + ebob);

        while (sayac <= sayi1 * sayi2) {
            if (sayac % sayi1 == 0 && sayac % sayi2 == 0) {
                System.out.println(sayi1 + " ve " + sayi2 + " EKOK'u : " + sayac);
                break;
            }
            sayac++;
        }
    }
}
