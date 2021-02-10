import java.util.Scanner;
import java.util.Stack;
public class l_012_prefixevaluationandconversion {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] agrs) {
        String expression = scn.nextLine();
        prefixEvaluationAndConversion(expression);
    }
    public static void prefixEvaluationAndConversion(String expression) {
        Stack<Integer> vs = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        for(int i=expression.length()-1; i>=0; i--) {
            char ch = expression.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1,v2,ch); 
                vs.push(val);

                String inv1 = infix.pop();
                String inv2 = infix.pop();
                String inval = "(" + inv1 + ch + inv2 + ")";
                infix.push(inval);

                String postv1 = postfix.pop();
                String postv2 = postfix.pop();
                String postval = postv1 + postv2 + ch;
                postfix.push(postval);
            }
            else { 
                vs.push(ch-'0');           //char to integer
                infix.push(ch+"");         //char to string
                postfix.push(ch+"");    
            }
        }
        System.out.println(vs.peek());
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
    }

    public static int operation(int v1, int v2, char operator) {
        if(operator=='+') {
            return v1+v2;
        }
        else if(operator=='-') {
            return v1-v2;
        }
        else if(operator=='*') {
            return v1*v2;
        }
        else {
            return v1/v2;
        }
    }
}