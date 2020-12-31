import java.util.Scanner;
public class l_011_printsubsequence {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        printSubsequence(s);
    }
    public static void printSubsequence(String s) {
        for(int i=0; i< (1<<s.length()) ; i++) {
            for(int j=s.length()-1; j>=0; j--) {
                int mask = 1<<j;
                if( (i&mask) != 0 ) {     //jth bit is on
                    System.out.print(s.charAt(s.length()-1-j));   
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}