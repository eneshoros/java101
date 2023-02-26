import java.util.Scanner;
public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("Bir sayı giriniz : ");
        sayi=input.nextInt();
        for (int i=1;i<sayi;i++){
            if(sayi%i==0)
                toplam+=i;
        }
        if(sayi==toplam)
            System.out.println(sayi+" mükemmel sayıdır.");
        else
            System.out.println(sayi+" mükemmel sayı değildir.");
    }
}