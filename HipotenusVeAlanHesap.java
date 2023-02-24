import java.util.Scanner;
public class HipotenusVeAlanHesap {
    public static void main(String[] args) {
        /*int kenar1,kenar2;
        double hipotenus;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk kenarı girin : ");
        kenar1=input.nextInt();
        System.out.print("İkinci kenari girin : ");
        kenar2=input.nextInt();
        hipotenus = Math.sqrt((Math.pow(kenar1,2))+Math.pow(kenar2,2));
        System.out.println("Hipotenüs : "+hipotenus);*/

        double kenar1,kenar2,kenar3,u,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("Kenar1 : ");
        kenar1=input.nextDouble();
        System.out.print("Kenar2 : ");
        kenar2=input.nextDouble();
        System.out.print("Kenar3 : ");
        kenar3=input.nextDouble();
        u=(kenar1+kenar2+kenar3)/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin alanı : "+alan);
    }
}
