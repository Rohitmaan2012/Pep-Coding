import java.util.Scanner;
import java.util.Stack;

public class l_002_stack {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        solution(st);
    }
    public static void solution(Stack<Integer> st) {
        st.push(10);
        st.push(30);
        st.push(15);
        System.out.println(st);
        st.push(20);
        System.out.println(st);

        System.out.println(st.peek());   //give toppest value in the stack
        System.out.println(st);

        System.out.println(st.pop());    //gives toppest value in the stack and removes it 
        System.out.println(st);
    }
}