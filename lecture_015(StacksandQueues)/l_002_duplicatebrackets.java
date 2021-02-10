import java.util.Scanner;
import java.util.Stack;
public class l_002_duplicatebrackets {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.nextLine();
        System.out.println(duplicateBrackets(str));
    }
    public static boolean duplicateBrackets(String str) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==')') {
                if(st.peek()=='(') {
                    return true;
                }
                else {
                    while(st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        return false;
    }
}