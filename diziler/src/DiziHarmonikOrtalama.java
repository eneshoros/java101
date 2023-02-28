public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5};
        double toplam=0;
        for(int i:dizi){
            toplam+=(1.0/i);
        }
        System.out.println("Dizinin harmonik seri ortalaması : "+(dizi.length/toplam));
    }
}
