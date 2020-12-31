import java.util.Scanner;
public class l_002_matrixmultiplication {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] one = new int[r1][c1];
        input(one);
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] two = new int[r2][c2];
        input(two);
        int[][] prd = new int[r1][c2];
        matrixMultiplication1(prd,one,two,c1,r2);
        //matrixMultiplication2(prd,one,two,c1,r2);
    }
    public static void display(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void input(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void matrixMultiplication1(int[][] prd, int[][] one, int[][] two, int c1, int r2) {
        if(c1 == r2) {
            for(int i=0; i<prd.length; i++) {
                for(int j=0; j<prd[i].length; j++) {
                    for(int k=0; k<c1; k++) {
                        prd[i][j] += one[i][k] * two[k][j];
                    }
                } 
            }
            display(prd);
        }
        else {
            System.out.println("Invalid input");
        }
    }
    public static int[][] matrixMultiplication2(int[][] prd, int[][] one, int[][] two, int c1, int r2) {
        if(c1 == r2) {
            for(int i=0; i<prd.length; i++) {
                for(int j=0; j<prd[i].length; j++) {
                    for(int k=0; k<c1; k++) {
                        prd[i][j] += one[i][k] * two[k][j];
                    }
                } 
            }
            display(prd);
        }
        else {
        	System.out.println("Invalid input");
        }
        return prd;
    }
}