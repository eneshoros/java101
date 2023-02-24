import java.util.Scanner;

public class NotOrtalamaHesap {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        float ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Mat notu:");
        mat=input.nextInt();
        System.out.print("Fizik notu:");
        fizik=input.nextInt();
        System.out.print("Kimya notu:");
        kimya=input.nextInt();
        System.out.print("Türkçe notu:");
        turkce=input.nextInt();
        System.out.print("Tarih notu:");
        tarih=input.nextInt();
        System.out.print("Müzik notu:");
        muzik=input.nextInt();
        ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız : "+ortalama);
        System.out.println((ortalama>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
