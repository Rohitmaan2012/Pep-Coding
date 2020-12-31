import java.util.Scanner;
public class l_002_printcharandsubstrings {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        //System.out.println(s);
        displayChar(s);
        displaySubstrings(s);
    }
    public static void displayChar(String s) {
        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void displaySubstrings(String s) {
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
}