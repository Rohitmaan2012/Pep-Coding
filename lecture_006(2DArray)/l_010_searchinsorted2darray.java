import java.util.Scanner;
public class l_010_searchinsorted2darray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        int data = scn.nextInt();
        searchInSorted2dArray(arr,data);
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
        display(arr);
    }
    public static void searchInSorted2dArray(int[][] arr, int data) {
        int i = 0;
        int j = arr[0].length-1;

        while(i<arr.length && j>=0) {
            if(data<arr[i][j]) {
                j--;
            }
            else if(data>arr[i][j]) {
                i++;
            }
            else {
                System.out.println(i+","+j);
                return;
            }
        }
        System.out.println("Not Found");
    }
}