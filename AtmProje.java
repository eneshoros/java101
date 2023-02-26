import java.util.Scanner;

public class AtmProje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hak = 3, secim, bakiye = 1500, tutar;
        String kullaniciAdi, sifre;
        while (hak > 0) {
            System.out.print("Kullanıcı adı : ");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifre : ");
            sifre = input.nextLine();
            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz!");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    System.out.println("1- Para yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yap");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutar : ");
                            tutar = input.nextInt();
                            bakiye += tutar;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutar : ");
                            tutar = input.nextInt();
                            if (tutar > bakiye)
                                System.out.println("Bakiye yetersiz.");
                            else
                                bakiye -= tutar;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            } else {
                hak--;
                if (hak == 0)
                    System.out.println("Hakkınız bitti.Hesap bloke oldu.Banka ile iletişime geçiniz.");
                else {
                    System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız : " + hak);
                }
            }
        }
    }
}