import java.util.Scanner;
public class l_003_nqueens {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess,"",0);
    }
    public static boolean isSafe(int[][] chess, int row, int col) {
        //vertical
        for(int i=row-1, j=col; i>=0; i--) {
            if(chess[i][j]==1) {
                return false;
            }
        }
        //diagonal backward 
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(chess[i][j]==1) {
                return false;
            }
        }//diagonal forward
        for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--,j++) {
            if(chess[i][j]==1) {
                return false;
            }
        }
        return true;
    }
    public static void printNQueens(int[][] chess, String path, int row) {
        if(row==chess.length) {
            System.out.println(path+".");
            return;
        }
        for(int col=0; col<chess.length; col++) {       //Square Matrix
            if(isSafe(chess,row,col)==true) {
                chess[row][col]=1;
                printNQueens(chess, path + row + "-" + col + ",", row+1);
                chess[row][col]=0;
            }
        }
    }
}