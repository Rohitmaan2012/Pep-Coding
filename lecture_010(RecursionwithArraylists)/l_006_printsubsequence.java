import java.util.Scanner;
public class l_006_printsubsequence {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.nextLine();
        printSubsequence(str,"");
    }
    public static void printSubsequence(String ques, String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSubsequence(roq,ans+"-");     //wrong 
        printSubsequence(roq,ans+ch);      //right
    }
}