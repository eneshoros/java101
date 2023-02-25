import java.util.Scanner;

public class UsluSayiHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sayiUs, sonuc = 1;
        System.out.print("Üs alınacak sayıyı giriniz : ");
        sayi = input.nextInt();
        System.out.print("Sayının kaçıncı üssü alınacak ? : ");
        sayiUs = input.nextInt();
        for (int i = 1; i <= sayiUs; i++)
            sonuc *= sayi;
        System.out.println(sayi + " üzeri " + sayiUs + " : " + sonuc);
    }
}
