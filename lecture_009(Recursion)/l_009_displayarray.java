import java.util.Scanner;
public class l_009_displayarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        displayArr(arr,0);
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static void displayArr(int[] arr, int idx) {
        if(idx==arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }
}