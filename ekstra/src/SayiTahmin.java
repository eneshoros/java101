import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rnd=new Random();
        int rastgeleSayi=rnd.nextInt(100);
        Scanner input=new Scanner(System.in);
        boolean isNotRange=false,isWin=false;
        int[] yanlisTahmin=new int[5];
        int hak=5,tahmin;
        System.out.println("Rastgele sayımız : "+rastgeleSayi);
        System.out.println("---------------");
        while (hak>0){
            System.out.print("Tahmininizi giriniz : ");
            tahmin=input.nextInt();
            if(tahmin<0 || tahmin>99){
                if(!isNotRange){
                    System.out.println("Tahmininiz 0-100 aralığında olmalı.Tekrar yanlış girerseniz hakkınız eksilecektir.");
                    isNotRange=true;
                }
                else {
                    System.out.println("Tahmininiz yine aralık dışıdır.Kalan hakkınız : " + (--hak));
                    yanlisTahmin[hak]=tahmin;
                }
                continue;
            }
            if (tahmin==rastgeleSayi){
                System.out.println("Tebrikler doğru tahmin yaptınız.Doğru tahmin edilen sayı : "+tahmin);
                isWin=true;
                break;
            }
            else{
                if(tahmin<rastgeleSayi){
                    System.out.println("Tahmininiz küçüktür.Lütfen büyültünüz.");
                    System.out.println("Kalan hakkınız : "+(--hak));
                    yanlisTahmin[hak]=tahmin;
                }
                else {
                    System.out.println("Tahmininiz büyüktür.Lütfen küçültünüz");
                    System.out.println("Kalan hakkınız : "+(--hak));
                    yanlisTahmin[hak]=tahmin;
                }
            }
        }
        if (!isWin){
            System.out.println("Doğru tahmin edemediniz.Tahminleriniz : "+ Arrays.toString(yanlisTahmin));
            System.out.println("Tahmin edilemeyen sayi : "+rastgeleSayi);
        }
    }
}
