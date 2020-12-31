import java.util.Scanner;
public class l_003_wavetraversal {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        waveTraversal(arr);
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
    public static void waveTraversal(int[][] arr) {
        for(int j=0; j<arr[0].length; j++) {
            if(j%2==0) {
                for(int i=0; i<arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }
            else {
                for(int i=arr.length-1; i>=0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}