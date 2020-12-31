import java.util.Scanner;
public class l_013_sort01 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
		int[] arr = new int[n];
		input(arr);
        display(partitionSort01(arr));
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
    public static int[] partitionSort01(int[] arr) {
        int i=0;
        int j=0;
        while(i<arr.length) {
            if(arr[i]==1) {
                i++;
            }
            else {
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return arr;
    }
}