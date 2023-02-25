import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris;
        System.out.print("Sınır sayısını giriniz : ");
        giris = input.nextInt();
        System.out.println("Dördün katları\tBeşin katları");
        for (int i = 1, j = 1; i <= giris && j <= giris; i *= 4, j *= 5)
            System.out.println(i + "\t" + j);
    }
}
