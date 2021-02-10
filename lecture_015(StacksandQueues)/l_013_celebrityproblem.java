import java.util.Scanner;
import java.util.Stack;
public class l_013_celebrityproblem {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] agrs) {
        int n = Integer.parseInt(scn.nextLine());
        int[][] arr = new int[n][n];
        input(arr);
        System.out.println(findCelebrity(arr));
    }
    public static void input(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            String str = scn.nextLine();
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
    }
    public static int findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            st.push(i);
        }
        while(st.size()>1) {
            int i = st.pop();
            int j = st.pop();
            if(arr[i][j]==1) {         //if i knows j  ->  i is not a celebrity
                st.push(j);
            }
            else {                     //if i dont know j  ->  j is not a celebrity
                st.push(i);
            }
        }
        int pot = st.peek();
        for(int i=0; i<arr.length; i++) {
            if(i != pot) {
                if(arr[i][pot]==0 || arr[pot][i]==1) {
                    return -1;
                }
            }
        }
        return pot;
    }
}