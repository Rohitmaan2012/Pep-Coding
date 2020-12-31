import java.util.Scanner;
public class l_013_firstindex {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int d = scn.nextInt();
        int fi = firstIndex(arr,0,d);
        System.out.println(fi);
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static int firstIndex(int[] arr, int idx, int x) {
        if(idx==arr.length) {
            return -1;
        }
        //Short approach
        if(arr[idx]==x) {
            return idx;
        }
        else {
            int fiisa = firstIndex(arr,idx+1,x);   //fiisa = first index in small array
            return fiisa;
        }
    }
}
