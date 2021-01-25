import java.util.Scanner;
public class l_018_countonlyabcsubsequences {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.next();
        System.out.println(countsubsequences(str));
    }
    public static int countsubsequences(String str) {
        int a = 0;
        int ab = 0;
        int abc = 0;
        for(int i=0; i<str.length(); i++) {
            char r = str.charAt(i);
            if(r=='a') {
                a = 2*a + 1;
            }
            else if(r=='b') {
                ab = 2*ab + a; 
            }
            else if(r=='c') {
                abc = 2*abc + ab;
            }
        }
        return abc;
    }
}