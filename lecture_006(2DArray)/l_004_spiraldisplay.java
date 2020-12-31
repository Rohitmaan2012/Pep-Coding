import java.util.Scanner;
public class l_004_spiraldisplay {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr); 
        //waveTraversal(arr);
        spiralDisplay(arr,n,m);
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
    public static void spiralDisplay(int[][] arr, int n, int m) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int total = n*m;
        int count = 0;

        while(count<total) {
            for(int i=minr, j=minc; i<=maxr && count<total; i++) {    //left wall
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
             
            for(int j=minc, i=maxr; j<=maxc && count<total; j++) {    //bottom wall
            	System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            for(int i=maxr, j=maxc; i>=minr && count<total; i--) {    //right wall
            	System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            for(int j=maxc, i=minr; j>=minc && count<total; j--) {    //top wall
            	System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}