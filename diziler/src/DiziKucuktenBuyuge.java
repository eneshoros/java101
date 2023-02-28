import java.util.Scanner;
import java.util.Arrays;
public class DiziKucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int adet;
        int[] dizi;
        System.out.print("Dizinin boyutu n : ");
        adet=input.nextInt();
        dizi=new int[adet];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i=0;i<adet;i++){
            System.out.print((i+1)+". Elemanı : ");
            dizi[i]=input.nextInt();
        }
        Arrays.sort(dizi);
        for (int eleman:dizi)
            System.out.print(eleman+" ");
    }
}
