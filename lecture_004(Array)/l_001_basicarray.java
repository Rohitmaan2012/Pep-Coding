import java.util.Scanner;
public class l_001_basicarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        display(arr);
    }
    public static void display(int[] arr) {
        for(int r: arr) {                   //for(int i=0; i<arr.length; i++) {
            System.out.print(r+" ");        //    int r = arr[i];
        }                                   //    System.out.print(r+" ");
        System.out.println();               //}  
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        display(arr);
    }
}