import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,tutar=0;
        int kilo;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        tutar+=armut*input.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        tutar+=elma*input.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        tutar+=domates*input.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        tutar+=muz*input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        tutar+=patlican*input.nextInt();
        System.out.println("Toplam tutar : "+tutar);
    }
}
