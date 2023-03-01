import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    char[][] game;
    char[][] mineInGame;
    int mineNumber;
    int[] mineRow;
    int[] mineCol;
    int guessRow;
    int guessCol;
    int step;
    boolean isStart;
    boolean isWin;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.game = new char[rowNumber][colNumber];
        this.mineInGame = new char[rowNumber][colNumber];
        this.mineNumber = (this.rowNumber * this.colNumber) / 4;
        this.guessRow=0;
        this.guessCol=0;
        this.isStart = false;
        this.isWin=false;
        this.step=0;
        fillGame(this.game);
        fillGame(this.mineInGame);
        fillMineInGame(this.mineInGame);
    }

    char[][] fillGame(char[][] dizi) {
        for (int i = 0; i < this.rowNumber; i++)
            for (int j = 0; j < this.colNumber; j++)
                dizi[i][j] = '-';
        return dizi;
    }

    char[][] fillMineInGame(char[][] dizi) {
        Random rnd = new Random();
        int rastgeleSayi;
        int sayac=0;
        int tempMine=this.mineNumber;
        while (tempMine > 0) {
            rastgeleSayi = rnd.nextInt((this.rowNumber * this.colNumber));
            this.mineRow[sayac] = rastgeleSayi / 3;
            this.mineCol[sayac] = rastgeleSayi % 3;
            this.mineInGame[rastgeleSayi / 3][rastgeleSayi % 3] = '*';
            tempMine--;
        }
        return this.mineInGame;
    }
    void guess() {
        Scanner input=new Scanner(System.in);
        if(!this.isWin){
            System.out.print("Satır giriniz : ");
            this.guessRow=input.nextInt();
            System.out.print("Sütun giriniz : ");
            this.guessCol=input.nextInt();
            if(this.mineInGame[guessRow][guessCol]=='*'){
                System.out.println("Game Over!!\n==========");
            }
            else {
                if(this.game[guessRow][guessCol]=='-')
                    this.step++;
                System.out.println(step);
                if (this.step == (this.rowNumber * this.colNumber) - this.mineNumber) {
                    System.out.println("Oyunu Kazandınız !");
                    this.isWin = true;
                }
                for (int i = 0; i < this.rowNumber; i++) {
                    for (int j = 0; j < this.colNumber; j++) {
                        if (i == this.guessRow && j == this.guessCol)
                            this.game[i][j] = mineNear(i, j);
                    }
                }
                for (int i = 0; i < this.rowNumber; i++) {
                    for (int j = 0; j < this.colNumber; j++) {
                        System.out.print(this.game[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("==========");
                if (!this.isWin)
                    guess();
            }
        }
    }
    char mineNear(int x,int y){
        int mines=0;
        mines += mineAt(x - 1, y - 1);
        mines += mineAt(x - 1, y);
        mines += mineAt(x - 1, y + 1);
        mines += mineAt(x, y - 1);
        mines += mineAt(x, y + 1);
        mines += mineAt(x + 1, y - 1);
        mines += mineAt(x + 1, y);
        mines += mineAt(x + 1, y + 1);
        if (mines>0) return (char) (48+mines);
        else return '0';
    }
    int mineAt(int x,int y){
        if(x>=0 && x<this.rowNumber && y>=0 && y<colNumber && this.mineInGame[x][y]=='*')
            return 1;
        else return 0;
    }

    void printMine() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.mineInGame[i][j]);
            }
            System.out.println();
        }
        System.out.println("==========");
        isStart = true;
    }
    void printGame(){
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.game[i][j]);
            }
            System.out.println();
        }
    }
    void run() {
        printMine();
        printGame();
        guess();
    }
}
