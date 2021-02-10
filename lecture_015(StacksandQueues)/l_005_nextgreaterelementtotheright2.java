import java.util.Scanner;
import java.util.Stack;
public class l_005_nextgreaterelementtotheright2 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        display(nextGreaterElement(arr));
    }
    public static void display(int[] arr) {
        for(int r: arr) {
            System.out.print(r+" ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i=1; i<2*n; i++) {
            while(st.size()>0 && arr[i%n]>arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i%n];
                st.pop();
            }
            if(i<n) {
                st.push(i);
            }
        }
        while(st.size()>0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}