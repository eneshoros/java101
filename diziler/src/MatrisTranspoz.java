public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris={
                {1,2,3},
                {4,5,6}
        };
        int[][] transpoz=new int[matris[0].length][matris.length];
        //Matrisi print
        System.out.println("Matris : ");
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[0].length;j++)
                System.out.print(matris[i][j]+"\t");
            System.out.println();
        }
        //Değerleri transpoza taşıma
        for (int i=0;i<transpoz.length;i++)
            for (int j=0;j<transpoz[0].length;j++)
                transpoz[i][j]=matris[j][i];
        //Transpozu print
        System.out.println("Transpoze : ");
        for (int i=0;i<transpoz.length;i++){
            for (int j=0;j<transpoz[0].length;j++)
                System.out.print(transpoz[i][j] + "\t");
            System.out.println();
        }


    }
}
