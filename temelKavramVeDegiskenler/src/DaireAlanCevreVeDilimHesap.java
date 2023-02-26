import java.util.Scanner;
public class DaireAlanCevreVeDilimHesap {
    public static void main(String[] args) {
        /*int r;
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r=input.nextInt();
        System.out.println("Dairenin alanı : "+(pi*r*r));
        System.out.println("Dairenin çevresi : "+(2*pi*r));*/

        Scanner input=new Scanner(System.in);
        int r,aci;
        double pi=3.14,dilimAlani;
        System.out.print("Dairenin yarıçapınız giriniz : ");
        r=input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        aci=input.nextInt();
        System.out.println("Daire diliminin alanı : "+((pi*(r*r)*aci))/360);
    }
}
