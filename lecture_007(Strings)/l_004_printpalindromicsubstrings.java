import java.util.Scanner;
public class l_004_printpalindromicsubstrings {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        printPalindromeSubstrings(s);
    }
    public static void display(String s) {
        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static boolean isPalindrome(String s) {
        int si = 0;
        int ei = s.length()-1;
        while(si<ei) {
            if(s.charAt(si) != s.charAt(ei)) {
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public static void printPalindromeSubstrings(String s) {
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                String v = s.substring(i,j);
                //check whether this substring is palindrome or not
                boolean palindromic = isPalindrome(v);
                if(palindromic==true) {
                    System.out.println(v);
                }
            }
        }
    }
}