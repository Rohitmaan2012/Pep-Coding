import java.util.Scanner;
public class l_015_allindices {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int d = scn.nextInt();
        int[] ai = allIndices(arr,0,d,0);
        display(ai);
    }
    public static void display(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static int[] allIndices(int[] arr, int idx, int x, int fsf) {
        if(idx==arr.length) {              //fsf = found so far;
            return new int[fsf];
        }
        if(arr[idx]==x) {
            int[] iarr = allIndices(arr,idx+1,x,fsf+1); 
            iarr[fsf] = idx;
            return iarr;
        }
        else {
            int[] iarr = allIndices(arr,idx+1,x,fsf);
            return iarr;
        }
    }
}
