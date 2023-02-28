import java.util.Arrays;

public class DiziElemanFrekansi {
    public static void main(String[] args) {
        int[] dizi={10,20,20,10,10,20,5,20};
        int[] frekans=new int[dizi.length];
        Arrays.fill(frekans,0);
        System.out.println("Dizi : "+ Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");
        for (int i=0;i< dizi.length;i++){
            if(frekans[i]!=0)
                continue;
            int sayac=1;
            for (int j=i+1;j<dizi.length;j++){
                if(dizi[i]==dizi[j]){
                    frekans[j]=j;
                    sayac++;
                }
            }
            System.out.println(dizi[i]+" sayısı "+sayac+" kere tekrar edildi.");
        }
    }
}
