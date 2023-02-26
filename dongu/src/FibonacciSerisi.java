import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int elemanSayisi,sonuc=0,ilkEleman=0,ikinciEleman=0;
        System.out.print("Serinin gösterilecek eleman miktarı : ");
        elemanSayisi=input.nextInt();
        for (int i=0;i<=elemanSayisi;i++){
            if(i==0){
                ilkEleman=0;
                sonuc+=ilkEleman;
            }
            else if(i==1){
                ikinciEleman=1;
                sonuc+=ikinciEleman;
            }
            else {
                sonuc=ilkEleman+ikinciEleman;
                ilkEleman=ikinciEleman;
                ikinciEleman=sonuc;
            }
            System.out.print(sonuc+" ");
        }
    }
}
