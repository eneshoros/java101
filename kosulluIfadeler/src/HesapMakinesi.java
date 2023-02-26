import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.print("İlk sayıyı girin : ");
        sayi1=input.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        sayi2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        secim=input.nextInt();
        switch (secim){
            case 1:
                System.out.println("Sonuç : "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sonuç : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuç : "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0)
                    System.out.println("Sayı 0'a bölünemez");
                else if (sayi1<sayi2) {
                    System.out.println("Integer sayı bölmesinde ilk sayı büyük olmalıdır");
                }
                else
                    System.out.println("Sonuç : "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Geçerli seçim yapılmadı");
        }
    }
}
