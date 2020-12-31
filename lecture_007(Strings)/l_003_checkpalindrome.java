import java.util.Scanner;
public class l_003_checkpalindrome {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        System.out.println(isPalindrome(s));
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
}