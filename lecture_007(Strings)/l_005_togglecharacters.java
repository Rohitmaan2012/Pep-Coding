import java.util.Scanner;
public class l_005_togglecharacters {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        System.out.println(toggleChars(s));
    }
    public static String toggleChars(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++) {  
            char r = sb.charAt(i);          
            if(r>='a' && r<='z') {          
                r = (char)(r-'a'+'A');    
            }                              
            else {                          
                r = (char)(r-'A'+'a');      
            }                               
            sb.setCharAt(i,r);              
        }
        return sb.toString();
    }
}