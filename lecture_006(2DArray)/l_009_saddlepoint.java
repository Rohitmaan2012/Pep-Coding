import java.util.Scanner;
public class l_009_saddlepoint {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        //diagonalTraversal(arr);
        saddlePoint(arr);
    } 
    public static void display(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void input(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        display(arr);
    }
    public static void diagonalTraversal(int[][] arr) {
        for(int g=0; g<arr.length; g++) {
            for(int j=g, i=0; j<arr[0].length; j++,i++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void saddlePoint(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            int minvalj = 0;
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j]<arr[i][minvalj]) {
                    minvalj = j;
                }
            }
            boolean flag = true;
            for(int k=0; k<arr.length; k++) {
                if(arr[k][minvalj]>arr[i][minvalj]) {
                    flag = false;
                    break;
                } 
            }
            if(flag==true) {
                System.out.println("Saddle Point: "+ arr[i][minvalj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}