import java.util.Scanner;
public class l_005_exitpoint {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr); 
        //waveTraversal(arr);
        //spiralDisplay(arr,n,m);
        exitPoint(arr);
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
            for(int i=minr, j=minc; i<=maxr && count<total; i++) { 
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
             
            for(int j=minc, i=maxr; j<=maxc && count<total; j++) {
            	System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            for(int i=maxr, j=maxc; i>=minr && count<total; i--) { 
            	System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            for(int j=maxc, i=minr; j>=minc && count<total; j--) {
            	System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
    public static void exitPoint(int[][] arr) {
        int dir = 0;  //0=e, 1=s, 2=w, 3=n 
        int i = 0;
        int j = 0;

        while(true) {
            dir = (dir + arr[i][j]) % 4;

            if(dir==0) {        //east
                j++;
            }
            else if(dir==1) {   //south
                i++;
            }
            else if(dir==2) {   //west
                j--;
            }
            else if(dir==3) {   //north
                i--;
            }

            if(i<0) {
                i++;
                break;
             }
            else if(j<0) {
                j++;
                break;
            }
            else if(i==arr.length) {
                i--;
                break;
            }
            else if(j==arr[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j); 
    }
}