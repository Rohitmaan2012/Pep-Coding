import java.util.Scanner;
public class l_006_consecutivecharacters {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        System.out.println(consecutiveChars(s));
    }
    public static String consecutiveChars(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++) { 
            char r = sb.charAt(i);         
            if(i%2==0) {
                r = (char)(r-1);
            }                   
            else {
                r = (char)(r+1);
            }         
            sb.setCharAt(i,r);             
        }
        return sb.toString();
    }
}
