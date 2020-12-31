import java.util.Scanner;
public class l_011_addmatrix {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String a[]) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		input(arr);
		int[][] brr = new int[n][m];
		input(brr);
		int[][] crr = new int[n][m];
		addmatrix(arr,brr,crr);
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
    public static void addmatrix(int[][] arr, int[][] brr, int[][] crr) {
    	for(int i=0; i<crr.length; i++) {
    		for(int j=0; j<crr[0].length; j++) {
    			crr[i][j] = arr[i][j] + brr[i][j];
    		}
    	}
    	display(crr);
    }
}