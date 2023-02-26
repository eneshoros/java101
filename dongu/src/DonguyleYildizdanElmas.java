import java.util.Scanner;
public class DonguyleYildizdanElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Yıldızdan elmas için herhangi bir sayı giriniz : ");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i) - 1; k++)
                System.out.print("*");
            System.out.println(" ");
        }
        for (int i = 1; i < sayi; i++) {
            for (int j = sayi - 1; j >= sayi - i; j--)
                System.out.print(" ");
            for (int k = 1; k <= ((sayi * 2) - 1) - (i * 2); k++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
