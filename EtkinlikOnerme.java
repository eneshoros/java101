import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.print("Etkinlik önerisi için sıcaklığı giriniz : ");
        sicaklik=input.nextInt();
        if(sicaklik<5)
            System.out.println("Kayak yapabilirsiniz.");
        else if (sicaklik<=15)
            System.out.println("Sinemaya gidebilirsiniz.");
        else if(sicaklik<=25)
            System.out.println("Pikniğe gidebilirsiniz.");
        else
            System.out.println("Yüzebilirsiniz.");
    }
}
