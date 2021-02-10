import java.util.Scanner;
import java.util.Stack;
public class l_004_nextgreaterelementtotheright1 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        display(nextGreaterElement2(arr));
    }
    public static void display(int[] arr) {
        for(int r: arr) {
            System.out.print(r+" ");
        }
        System.out.println();
    }
    public static int[] nextGreaterElement1(int[] arr) {
        int[] nge = new int[arr.length];
        nge[arr.length-1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);

        for(int i=arr.length-2; i>=0; i--) {
            while(st.size()>0 && arr[i]>=st.peek()) {
                st.pop();
            }
            if(st.size()==0) {
                nge[i] = -1;
            }
            else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
    public static int[] nextGreaterElement2(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i=1; i<arr.length; i++) {
            while(st.size()>0 && arr[i]>arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            } 
            st.push(i);
        }
        while(st.size()>0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}