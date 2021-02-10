import java.util.Scanner;
import java.util.Stack;
public class l_003_balancedbrackets {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.nextLine();
        System.out.println(balancedBrackets(str));
    }
    public static boolean balancedBrackets(String str) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') {
                st.push(ch);
            }
            else if(ch==')') {
                boolean val = closingPart(st,'(');
                if(val==false) {
                    return val;
                } 
            }
            else if(ch==']') {
                boolean val = closingPart(st,'[');
                if(val==false) {
                    return val;
                }
            }
            else if(ch=='}') {
                boolean val = closingPart(st,'{');
                if(val==false) {
                    return val;
                }
            }
        }
        if(st.size() != 0) {
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean closingPart(Stack<Character> st, char ch) {
        if(st.size()==0 || st.peek() != ch) {
            return false;
        }
        else if(st.peek() == ch) {
            st.pop();
        }
        return true;
    }
}    