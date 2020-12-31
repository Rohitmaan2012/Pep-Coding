import java.util.Scanner;
public class l_001_strings {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        
        //String s = scn.nextLine();
        //System.out.println("Hello "+s+" Welcome to my you tube channel");

        /*System.out.println(s.length());    //string length

        System.out.println(s.charAt(1));   //s[] = s.charAt()

        System.out.println(s.substring(2,6));
        System.out.println(s.substring(2,3));
        System.out.println(s.substring(2,2));
        //System.out.println(s.substring(2,1));
        System.out.println(s.substring(2)); */

        String s1 = "Hello";
        s1 = s1 + ' ';
        s1 = s1 + 'w';
        s1 = s1 + 'o';
        System.out.println(s1);

        System.out.println("hello"+10+20);
        System.out.println(10+20+"hello");

        String s2 = "geeks@for@geeks";
        String[] parts = s2.split("@");
        for(int i=0; i<parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}