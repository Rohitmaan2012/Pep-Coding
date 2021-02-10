import java.util.Scanner;
import java.util.Stack;
public class l_006_stockspan {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        display(stockSpan(arr));
    }
    public static void display(int[] arr) {
        for(int r: arr) {
            System.out.print(r+" ");
        }
        System.out.println();
    }
    public static int[] stockSpan(int[] arr) {
        int[] span = new int[arr.length];
        span[0] = 1;
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i=1; i<arr.length; i++) {
            while(st.size()>0 && arr[i]>arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                span[i] = i+1;
            }
            else {
                int pos = st.peek();
                span[i] = i-pos;
            }
            st.push(i);
        }
        return span;
    }
}