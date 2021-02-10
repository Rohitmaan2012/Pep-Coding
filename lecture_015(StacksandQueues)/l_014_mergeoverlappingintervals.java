import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
public class l_014_mergeoverlappingintervals {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] arr = new int[n][2];
        input(arr);
        display(mergeOverlappingIntervals(arr));
    }
    public static void display(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
    public static void input(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
        }
    }
    public static int[][] mergeOverlappingIntervals(int[][] arr) {
        Pair[] pairs = new Pair[arr.length];
        for(int i=0; i<arr.length; i++) {
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();
        for(int i=0; i<pairs.length; i++) {
            if(i==0) {
                st.push(pairs[i]);
            }
            else {
                Pair top = st.peek();

                if(pairs[i].st > top.et) {
                    st.push(pairs[i]);
                } 
                else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }
        int[][] brr = new int[st.size()][2];
        int k = 0;
        Stack<Pair> result = new Stack<>();
        while(st.size()>0) {
            result.push(st.pop());
        }
        while(result.size()>0) {
            Pair p = result.pop();
            brr[k][0] = p.st;
            brr[k][1] = p.et;
            k++;
        }
        return brr;
    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }
        //(this > other) return +ve
        //(this = other) return 0
        //(this < other) return -ve
        public int compareTo(Pair other) {
            if(this.st != other.st) {
                return this.st-other.st;
            }
            else {
                return this.et-other.et;
            }
        }
    }
}