public class YildizdanB {
    public static void main(String[] args) {
        String[][] dizi=new String[8][4];
        for (int i=0;i< dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                if(i==0 || i==3 || i==7){
                    System.out.print("* ");
                }
                else if(j==0 || j==3){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
