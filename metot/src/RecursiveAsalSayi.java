import java.util.Scanner;
public class RecursiveAsalSayi {
    static boolean isAsal(int sayi,int i){
        if(i==1) return true;
        else {
            if (sayi%i==0) return false;
            else return isAsal(sayi,i-1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Asal kontrolü için sayı girin : ");
        int sayi=input.nextInt();
        if(isAsal(sayi,sayi-1)) System.out.println(sayi+" asaldır.");
        else System.out.println(sayi+" asal değildir.");

    }
}
