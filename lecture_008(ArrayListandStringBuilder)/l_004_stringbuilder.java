import java.util.Scanner;
public class l_004_stringbuilder {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello"); 
        solution(sb);
    }
    public static void solution(StringBuilder sb) {
        //Add
        sb.append('g');    //add in ArrayList//push_back in vector//addLast in Deque
        System.out.println(sb);

        //Get
        char ch = sb.charAt(0);
        System.out.println(ch);

        //Insert
        sb.insert(2,'y');
        System.out.println(sb);

        //Replace
        sb.setCharAt(0,'d');
        System.out.println(sb);

        //Delete
        sb.deleteCharAt(2);
        System.out.println(sb);

        //Time Complexity -> O(n) -> wrong
        //Time Complexity -> O(n^2) -> right
        /* long start = System.currentTimeMillis();
        int n = 10000;
        String s = "";
        for(int i=0; i<=n; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration); */

        //Time Complexity -> O(n) -> right
        //Time Complexity -> O(n^2) -> wrong
        long start = System.currentTimeMillis();
        int n = 10000;
        StringBuilder st = new StringBuilder("");
        for(int i=0; i<=n; i++) {
            st.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
