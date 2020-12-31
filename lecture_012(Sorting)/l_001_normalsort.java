import java.util.Scanner;
public class l_001_normalsort {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        increasingOrder(arr);
        decreasingOrder(arr);
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
    }
    public static void increasingOrder(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        display(arr);
    }
    public static void decreasingOrder(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        display(arr);
    }
}