import java.util.Scanner;
public class l_007_printkeypadcombination {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.nextLine();
        printKpc(str,"");
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKpc(String ques, String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String deep = codes[ch-'0'];
        for(int i=0; i<deep.length(); i++) {
            char option = deep.charAt(i);
            printKpc(roq,ans+option);
        }
    }
}