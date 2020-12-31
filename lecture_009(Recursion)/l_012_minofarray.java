import java.util.Scanner;
public class l_012_minofarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int min = minOfArray(arr,0);
        System.out.println(min);
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static int minOfArray(int[] arr, int idx) {
        if(idx==arr.length-1) {
            return arr[idx];
        }
        int misa = minOfArray(arr,idx+1);   
        if(misa<arr[idx]) {        //misa = min in small array 
            return misa;
        }
        else {
            return arr[idx];
        }
    }
}
