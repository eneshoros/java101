import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,gecersizNot=0;
        double ortalama;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notu : ");
        mat=input.nextInt();
        if(mat<0 || mat>100){
            mat=0;
            gecersizNot++;
        }
        System.out.print("Fizik notu : ");
        fizik=input.nextInt();
        if(fizik<0 || fizik>100){
            fizik=0;
            gecersizNot++;
        }
        System.out.print("Türkçe notu : ");
        turkce=input.nextInt();
        if(turkce<0 || turkce>100){
            turkce=0;
            gecersizNot++;
        }
        System.out.print("Kimya notu : ");
        kimya=input.nextInt();
        if(kimya<0 || kimya>100){
            kimya=0;
            gecersizNot++;
        }
        System.out.print("Müzik notu : ");
        muzik=input.nextInt();
        if(muzik<0 || muzik>100){
            muzik=0;
            gecersizNot++;
        }
        ortalama=(mat+fizik+turkce+kimya+muzik)/(5-gecersizNot);
        if (ortalama<=55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız : "+ortalama);
        }
        else{
            System.out.println("Tebrikler,sınıfı geçtiniz!");
            System.out.println("Ortalamanız : "+ortalama);
        }

    }
}
