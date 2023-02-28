import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    static boolean isFind(int[] dizi,int sayi){
        for (int deger:dizi){
            if(deger==sayi)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] dizi={-20,2,7,1,0,2,0,3,4,8,9,6,4,31,6,10,10};
        int[] tekrarDizisi=new int[dizi.length];
        int sayac=0;
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j< dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j]){
                    if(!(isFind(tekrarDizisi,dizi[i])) && dizi[i]%2==0){
                        tekrarDizisi[sayac++]=dizi[i];
                    }
                }
            }
        }
        System.out.print("Tekrar eden çift sayılar : ");
        for (int show:tekrarDizisi){
            if(show!=0) System.out.print(show+" ");
        }
    }
}
