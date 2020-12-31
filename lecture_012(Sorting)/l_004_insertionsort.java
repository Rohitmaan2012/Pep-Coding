import java.util.Scanner;
public class l_004_insertionsort {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        insertionSort(arr);
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
    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            for(int j=i-1; j>=0; j--) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
                else {
                    break;
                }
            }
        }
        display(arr);
    }
}


