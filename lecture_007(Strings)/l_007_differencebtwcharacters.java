import java.util.Scanner;
public class l_007_differencebtwcharacters {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        System.out.println(differenceBtwChars(s));
    }
    public static String differenceBtwChars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length()-1; i++) {
            char r1 = s.charAt(i);
            char r2 = s.charAt(i+1);
            int diff = r2-r1;

            sb.append(r1);
            sb.append(diff);
        }
        sb.append(s.charAt(s.length()-1));

        return sb.toString();
    }
}