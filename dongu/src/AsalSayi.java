public class AsalSayi {
    public static void main(String[] args) {
        int sayac=0;
        for (int i=2;i<=100;i++){
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    sayac++;
                }
            }
            if (sayac==2)
                System.out.print(i+" ");
            sayac=0;
        }
    }
}
