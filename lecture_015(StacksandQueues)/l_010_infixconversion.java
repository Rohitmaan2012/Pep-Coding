import java.util.Scanner;
import java.util.Stack;
public class l_010_infixconversion {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] agrs) {
        String expression = scn.nextLine();
        infixConversion(expression);
    }
    public static void infixConversion(String expression) {
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i=0; i<expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch=='(') {
                operators.push(ch);
            }
            else if((ch>='0' && ch<='9') ||
                    (ch>='a' && ch<='z') ||
                    (ch>='A' && ch<='Z')) {
                postfix.push(ch+"");        //char to string
                prefix.push(ch+"");    
            }
            else if(ch==')') {  
                while(operators.peek() != '(') {
                    process(operators, postfix, prefix);
                }
                operators.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
                while(operators.size()>0 && operators.peek() != '(' && precedence(operators.peek()) >= precedence(ch)) {
                    process(operators, postfix, prefix);
                }
                operators.push(ch);
            }
        }
        while(operators.size() != 0) {
            process(operators, postfix, prefix);
        }

        System.out.println(prefix.peek());
        System.out.println(postfix.peek());
    }
    public static int precedence(char operator) {
        if(operator == '+' || operator=='-') {
            return 1;
        }
        else {
            return 2;
        }
    }
    public static void process(Stack<Character> operators, Stack<String> postfix, Stack<String> prefix) {
        char operator = operators.pop();
        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postval = postv1 + postv2 + operator;
        postfix.push(postval);

        String prev2 = prefix.pop();
        String prev1 = prefix.pop();
        String preval = operator + prev1 + prev2;
        prefix.push(preval);
    }
}