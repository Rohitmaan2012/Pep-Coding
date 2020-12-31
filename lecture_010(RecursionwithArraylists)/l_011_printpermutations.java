import java.util.Scanner;
public class l_011_printpermutations {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.next();
        printPermutations(str,"");
    }
    public static void printPermutations(String ques, String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<ques.length(); i++) {
            char ch = ques.charAt(i);
            String left = ques.substring(0,i);
            String right = ques.substring(i+1);
            String roq = left + right;
            printPermutations(roq,ans+ch);
        }
    }
}