import java.util.Scanner;
public class l_014_lastindex {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int d = scn.nextInt();
        int li = lastIndex(arr,0,d);
        System.out.println(li);
    }
    public static void input(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static int lastIndex(int[] arr, int idx, int x) {
        if(idx==arr.length) {
            return -1;
        }
        int liisa = lastIndex(arr,idx+1,x);
        if(liisa==-1) {
            if(arr[idx]==x) {
                return idx;
            }
            else {
                return -1;
            }
        }
        else {
            return liisa;
        }
    }
}
