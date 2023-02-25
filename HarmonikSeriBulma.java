import java.util.Scanner;
public class HarmonikSeriBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        double toplam=0;
        System.out.print("Harmonik serisinin bulmak istediğiniz sayı : ");
        sayi=input.nextInt();
        for (int i=1;i<=sayi;i++)
            toplam+=1.0/i;
        System.out.println("Sonuç : "+toplam);

    }
}
