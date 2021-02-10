import java.util.Scanner;
import java.util.Stack;
public class l_008_slidingwindowmaximum {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] agrs) {
        int[] arr = {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int k = 4;
        display(slidingWindowMaximum(arr,4));
    }
    public static void display(int[] arr) {
        for(int r: arr) {
            System.out.print(r+" ");
        }
        System.out.println();
    }
    public static int[] slidingWindowMaximum(int[] arr, int k) {
        int[] nge = new int[arr.length];
        nge[arr.length-1] = arr.length;

        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);

        for(int i=arr.length-2; i>=0; i--) {
            while(st.size()>0 && arr[i]>=arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                nge[i] = arr.length;
            }                                    //nge[i] -> index
            else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        int p = 0;
        int[] window = new int[arr.length-(k-1)];
        for(int i=0; i<=arr.length-k; i++) {
            int j= i;
            while(nge[j] < i+k) {
                j = nge[j];
            }
            window[p++] = arr[j];
        }
        return window;
    }
}