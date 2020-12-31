import java.util.Scanner;
public class l_014_sort012 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
		int[] arr = new int[n];
		input(arr);
        display(partitionSort012(arr));
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
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] partitionSort012(int[] arr) {
        // i to k     ->  unknown
        // k+1 to end ->  2's area 
		// j to i-1   ->  1's area
        // 0 to j-1   ->  0's area
        int i=0;
        int j=0;
        int k = arr.length-1;
        while(i<=k) {
            if(arr[i]==0) {
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==1) {
                i++;
            }
            else {
                swap(arr,i,k);
                k--;
            }
        }
        return arr;
    }
}