public class RecursiveFibonacci {
    static int fibonacci(int sayi){
        if(sayi==2 || sayi==1) return 1;
        else return fibonacci(sayi-2)+fibonacci(sayi-1);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
}
