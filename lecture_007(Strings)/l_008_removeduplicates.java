import java.util.Scanner;
public class l_008_removeduplicates {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        removeDuplicates(s);
    }
    public static void removeDuplicates(String s) {
        for(int i=0; i<s.length()-1; i++) {
            char r1 = s.charAt(i);
            char r2 = s.charAt(i+1);
            if(r1 != r2) {
                System.out.print(r1);
            }
        }
        System.out.print(s.charAt(s.length()-1));
    }
}