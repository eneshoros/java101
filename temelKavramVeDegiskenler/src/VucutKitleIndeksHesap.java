import java.util.Scanner;
public class VucutKitleIndeksHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kilo,boy,indeks;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=input.nextDouble();
        System.out.println("Vücut Kitle İndeksiniz : "+(kilo/(boy*boy)));
    }
}
