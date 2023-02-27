public class Palindrom {
    static boolean isPalindrom(int sayi){
        int geciciSayi=sayi,tersSayi=0,sonBasamak;
        while(geciciSayi!=0){
            sonBasamak=geciciSayi%10;
            tersSayi=(tersSayi*10)+sonBasamak;
            geciciSayi/=10;
        }
        return tersSayi==sayi?true:false;
    }
    public static void main(String[] args) {
        String sonuc = isPalindrom(101)?
                "Palindromdur"
                :
                "Palindrom değildir";
        System.out.println(sonuc);
    }
}