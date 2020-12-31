import java.util.Scanner;
public class l_004_knighttour {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess = new int[n][n];
        printKnightTour(chess,r,c,1);
    }
    public static void display(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printKnightTour(int[][] chess, int r, int c, int move) {
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c]>0) {
            return;
        } 
        else if(move==chess.length*chess.length) {
            chess[r][c] = move;
            display(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = move;
        printKnightTour(chess,r-2,c+1,move+1);
        printKnightTour(chess,r-1,c+2,move+1);
        printKnightTour(chess,r+1,c+2,move+1);
        printKnightTour(chess,r+2,c+1,move+1);
        printKnightTour(chess,r+2,c-1,move+1);
        printKnightTour(chess,r+1,c-2,move+1);
        printKnightTour(chess,r-1,c-2,move+1);
        printKnightTour(chess,r-2,c-1,move+1);
        chess[r][c] = 0;
    }
}