import java.util.Scanner;
public class l_016_pivotinsortedandrotatedarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        System.out.println(pivotInSortedAndRotatedAarray(arr));
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
    public static int pivotInSortedAndRotatedAarray(int[] arr) {
        int l = 0;
        int h = arr.length-1;
        while(l<h) {
            int mid = (l+h)/2;
            if(arr[mid]<arr[h]) {
                h = mid;
            }
            else {
                l = mid+1;
            }
        }
        return arr[l];
    }
}