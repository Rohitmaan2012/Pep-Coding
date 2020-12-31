import java.util.Scanner;
import java.util.Arrays;
public class l_015_targetsumpair1 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
		int[] arr = new int[n];
		input(arr);
        int target = scn.nextInt();
        targetSumPair1(arr,target);
    }
    public static void display(int[] arr) {
        for(int r: arr) {
            System.out.print(r+" ");
        }
        System.out.println();
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        display(arr);
    }
    public static void targetSumPair1(int[] arr, int target) {
        Arrays.sort(arr);   
        int l = 0;
        int r = arr.length-1;
        while(l<r) {
            if(arr[l]+arr[r]<target) {
                l++;
            }
            else if(arr[l]+arr[r]>target) {
                r--;
            }
            else {
                System.out.println(arr[l]+","+arr[r]);
                l++;
                r--;
            }
        }
    }
}