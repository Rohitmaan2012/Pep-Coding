import java.util.Scanner;
import java.util.Stack;
public class l_007_largestareahistogram {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] agrs) {
        int[] arr = {6,2,5,4,5,1,6};
        System.out.println(largestAreaHistogram(arr));
    }
    public static int largestAreaHistogram(int[] arr) {
        //Right Boundary
        int[] rb = new int[arr.length];  //NextSmallerElement(nse) index to the right
        rb[arr.length-1] = arr.length;

        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);

        for(int i=arr.length-2; i>=0; i--) {
            while(st.size()>0 && arr[i]<=arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                rb[i] = arr.length;
            }
            else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

        //Left Boundary
        int[] lb = new int[arr.length];  //NextSmallerElement(nse) index to the left
        lb[0] = -1;

        st = new Stack<>();
        st.push(0);

        for(int i=1; i<arr.length; i++) {
            while(st.size()>0 && arr[i]<=arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                lb[i] = -1;
            }
            else {
                lb[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for(int i=0; i<arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if(area>maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}