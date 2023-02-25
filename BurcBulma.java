import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int gun,ay;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğdunuz ay : ");
        ay=input.nextInt();
        System.out.print("Doğduğunuz gün : ");
        gun=input.nextInt();
        if(ay==4)
            System.out.println(gun<21?"Koç burcusunuz.":"Boğa burcusunuz.");
        else if(ay==5)
            System.out.println(gun<22?"Boğa burcusunuz.":"İkizler burcusunuz.");
        else if(ay==6)
            System.out.println(gun<23?"İkizler burcusunuz.":"Yengeç burcusunuz.");
        else if(ay==7)
            System.out.println(gun<23?"Yengeç burcusunuz.":"Aslan burcusunuz.");
        else if(ay==8)
            System.out.println(gun<23?"Aslan burcusunuz.":"Başak burcusunuz.");
        else if(ay==9)
            System.out.println(gun<23?"Başak burcusunuz.":"Terazi burcusunuz.");
        else if(ay==10)
            System.out.println(gun<23?"Terazi burcusunuz.":"Akrep burcusunuz.");
        else if(ay==11)
            System.out.println(gun<22?"Akrep burcusunuz.":"Yay burcusunuz.");
        else if(ay==12)
            System.out.println(gun<22?"Yay burcusunuz.":"Oğlak burcusunuz.");
        else if(ay==1)
            System.out.println(gun<22?"Oğlak burcusunuz.":"Kova burcusunuz.");
        else if(ay==2)
            System.out.println(gun<20?"Kova burcusunuz.":"Balık burcusunuz.");
        else if(ay==3)
            System.out.println(gun<21?"Balık burcusunuz.":"Koç burcusunuz.");
        else
            System.out.println("Hatalı giriş yapılmış.Lütfen tekrar deneyin");
    }
}
