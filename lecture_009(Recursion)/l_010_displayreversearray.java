import java.util.Scanner;
public class l_010_displayreversearray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        displayArrReverse(arr,0);
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==arr.length) {
            return;
        }
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}