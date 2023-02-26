import java.util.Scanner;
public class TaksimetreHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kmUcret=2.2,ucret;
        int acilis=10,mesafe;
        System.out.print("Gidilen mesafeyi giriniz : ");
        mesafe=input.nextInt();
        ucret=acilis+(mesafe*kmUcret);
        System.out.println(ucret<20 ? 20 : ucret);
    }
}
