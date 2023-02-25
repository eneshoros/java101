import java.util.Scanner;

public class KombinasyonHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, factN = 1, factR = 1, factFark = 1;
        System.out.print("Kombinasyon hesabı için n'i giriniz (C(n,r)) :");
        n = input.nextInt();
        System.out.print("Kombinasyon hesabı için r'yi giriniz (C(n,r)) :");
        r = input.nextInt();
        for (int i = 1; i <= n; i++)
            factN *= i;
        for (int j = 1; j <= r; j++)
            factR *= j;
        for (int k = 1; k <= (n - r); k++)
            factFark *= k;
        System.out.println("Kombinasyonun sonucu : " + (factN / (factR * factFark)));
    }
}
