import java.util.Scanner;
import java.util.Stack;
public class l_011_postfixevaluationandconversion {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] agrs) {
        String expression = scn.nextLine();
        postfixEvaluationAndConversion(expression);
    }
    public static void postfixEvaluationAndConversion(String expression) {
        Stack<Integer> vs = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        for(int i=0; i<expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1,v2,ch); 
                vs.push(val);

                String inv2 = infix.pop();
                String inv1 = infix.pop();
                String inval = "(" + inv1 + ch + inv2 + ")";
                infix.push(inval);

                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String preval = ch + prev1 + prev2;
                prefix.push(preval);
            }
            else { 
                vs.push(ch-'0');           //char to integer
                infix.push(ch+"");         //char to string
                prefix.push(ch+"");    
            }
        }
        System.out.println(vs.peek());
        System.out.println(infix.peek());
        System.out.println(prefix.peek());
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