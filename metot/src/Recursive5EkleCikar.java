import java.util.Scanner;
public class Recursive5EkleCikar {
    static void EkleCikar(int sayi,int islem,int sayac){
        System.out.print(sayi+" ");
        if(islem==0){
            if(sayi<=0) islem=1;
            else EkleCikar(sayi-5,0,sayac-1);
        }
        if(islem==1){
            if(sayac==0) return;
            EkleCikar(sayi+5,1,sayac+1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.print("N Sayısı : ");
        sayi=input.nextInt();
        System.out.print("Çıktısı : ");
        EkleCikar(sayi,0,0);
    }
}
