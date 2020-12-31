import java.util.Scanner;
public class l_002_anybasetodecimal {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(getValueInDecimal(n,b));
    }
    public static int getValueInDecimal(int n, int b) {
        int p = 1;
        int dn = 0;
        while(n>0) {
            int digit = n%10;
            dn += digit*p;
            p = p*b;
            n/=10;
        }
        return dn;
    }
}