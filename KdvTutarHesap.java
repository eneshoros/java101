import java.util.Scanner;
public class KdvTutarHesap {
    public static void main(String[] args) {
        double paraMiktari,kdvOran=0.18,kdvTutari,kdvliFiyat;
        Scanner input=new Scanner(System.in);
        System.out.print("Para miktarınızı girin : ");
        paraMiktari=input.nextDouble();
        kdvOran = (paraMiktari>=0 && paraMiktari<=1000) ? 0.18 : 0.08;
        kdvTutari=paraMiktari*kdvOran;
        kdvliFiyat=paraMiktari+kdvTutari;
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı : "+kdvTutari);
        System.out.println("KDV'li Fiyat : "+kdvliFiyat);
    }
}
