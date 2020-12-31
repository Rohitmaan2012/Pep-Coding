import java.util.Scanner;
public class l_011_maxofarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static int maxOfArray(int[] arr, int idx) {
        if(idx==arr.length-1) {
            return arr[idx];
        }
        int misa = maxOfArray(arr,idx+1);
        if(misa>arr[idx]) {        //misa = max in small array
            return misa;
        }
        else {
            return arr[idx];
        }
    }
}
