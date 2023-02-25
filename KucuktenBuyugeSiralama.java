import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int s1, s2, s3, min;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayı :");
        s1 = input.nextInt();
        System.out.print("2.Sayı :");
        s2 = input.nextInt();
        System.out.print("3.Sayı :");
        s3 = input.nextInt();
        if (s1 < s2 && s1 < s3) {
            if (s2 < s3)
                System.out.println(s1 + "<" + s2 + "<" + s3);
            else
                System.out.println(s1 + "<" + s3 + "<" + s2);
        } else if (s2 < s1 && s2 < s3) {
            if (s1 < s3)
                System.out.println(s2 + "<" + s1 + "<" + s3);
            else
                System.out.println(s2 + "<" + s3 + "<" + s1);
        } else {
            if (s1 < s2)
                System.out.println(s3 + "<" + s1 + "<" + s2);
            else
                System.out.println(s3 + "<" + s2 + "<" + s1);
        }

}
}
