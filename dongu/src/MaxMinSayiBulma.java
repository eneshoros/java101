import java.util.Scanner;
public class MaxMinSayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,adet=0,enKucuk=0,enBuyuk=0,gecici=0;
        while (!(adet>0)){
            System.out.print("Kaç tane sayı gireceksiniz : ");
            adet=input.nextInt();
        }
        for(int i=1;i<=adet;i++){
            System.out.print(i+". Sayıyı giriniz: ");
            sayi=input.nextInt();
            if(i==1){
                enKucuk=sayi;
                enBuyuk=sayi;
            }
            else{
                if (enKucuk>sayi){
                    enKucuk=sayi;
                }
                if (enBuyuk<sayi)
                    enBuyuk=sayi;
            }
        }
        System.out.println("En büyük sayı : "+enBuyuk);
        System.out.println("En küçük sayı : "+enKucuk);
    }
}
