import java.util.Scanner;
import java.util.Stack;
public class l_009_infixevaluation {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] agrs) {
        String expression = scn.nextLine();
        System.out.println(infixEvaluation(expression));
    }
    public static int infixEvaluation(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i=0; i<expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch=='(') {
                operators.push(ch);
            }
            else if(Character.isDigit(ch)) {
                operands.push(ch-'0');      //char to int
            }
            else if(ch==')') {  
                while(operators.peek() != '(') {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int val = operation(v1, v2 , operator);
                    operands.push(val);
                }
                operators.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
                while(operators.size()>0 && operators.peek() != '(' && precedence(operators.peek()) >= precedence(ch)) {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int val = operation(v1, v2 , operator);
                    operands.push(val);
                }
                operators.push(ch);
            }
        }
        while(operators.size() != 0) {
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            int val = operation(v1, v2 , operator);
            operands.push(val); 
        }
        return operands.peek();
    }
    public static int precedence(char operator) {
        if(operator == '+' || operator=='-') {
            return 1;
        }
        else {
            return 2;
        }
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