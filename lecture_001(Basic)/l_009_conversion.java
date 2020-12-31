import java.util.Scanner;
public class l_009_conversion {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	//String to an Integer
        String str = scn.nextLine();
        int i = Integer.parseInt(str);
        System.out.println(i);
        
        //Integer to a String
        int m = scn.nextInt();
        String spd = Integer.toString(m);
        System.out.println(spd);
        
        //Integer to a String
        int p = scn.nextInt();
        String lol = String.valueOf(p);
        System.out.println(lol);
    }
}