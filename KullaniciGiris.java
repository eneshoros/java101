import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String k_adi,sifre,yeniSifre;
        int secim;
        System.out.print("Kullanıcı adını giriniz : ");
        k_adi=input.nextLine();
        System.out.print("Şifrenizi giriniz :");
        sifre=input.nextLine();
        if(k_adi.equals("patika") && sifre.equals("java123"))
            System.out.println("Giriş Yapıldı");
        else{
            if (k_adi.equals("patika")){
                System.out.print("Şifreniz yanlış.Şifreyi sıfırlamak isterseniz 1'e basın : ");
                secim=input.nextInt();
                if (secim==1){
                    System.out.print("Yeni şifrenizi giriniz : ");
                    input.nextLine();
                    yeniSifre=input.nextLine();
                    if(yeniSifre.equals(sifre) || yeniSifre.equals("java123"))
                        System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                    else
                        System.out.println("Şifre oluşturuldu.");
                }
                else
                    System.out.println("Şifre oluşturma başlayamadı.(1'e basmadınız)");
            }
            else
                System.out.println("Kullanıcı adı 'patika'");

        }
    }
}
