import java.util.Scanner;
public class RecursiveUsAlma {
    static int usAlma(int sayi,int us) {
        if (us==0) return sayi=1;
        else if (us==1) return sayi;
        else return sayi*=usAlma(sayi,us-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,us;
        System.out.print("Üs alınacak sayı : ");
        sayi=input.nextInt();
        System.out.print("Kaçıncı üs değerini istiyorsunuz ? : ");
        us=input.nextInt();
        System.out.println(usAlma(sayi,us));
    }
}
