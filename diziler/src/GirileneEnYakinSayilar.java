import java.util.Arrays;
import java.util.Scanner;
public class GirileneEnYakinSayilar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,enYakinKucuk=0,enYakinBuyuk=0;
        int[] dizi={15,12,788,1,-1,-778,2,0};
        System.out.print("Dizi : {");
        for (int i:dizi)
            System.out.print(i+" ");
        System.out.println("}");
        Arrays.sort(dizi);
        System.out.print("Girilen Sayı : ");
        sayi=input.nextInt();
        for (int j:dizi){
            if(j>sayi){
                enYakinKucuk=j;
                break;
            }
            if(j<sayi)
                enYakinBuyuk=j;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+enYakinKucuk);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+enYakinBuyuk);
    }
}
