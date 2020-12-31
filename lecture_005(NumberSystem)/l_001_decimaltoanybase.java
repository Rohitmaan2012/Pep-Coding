import java.util.Scanner;
public class l_001_decimaltoanybase {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(getValueInBase(n,b));
    }
    public static int getValueInBase(int n, int b) {
        int p = 1;
        int dn = 0;
        while(n!=0) {
            int digit = n%b;
            dn += digit*p;
            p = p*10;
            n/=b;
        }
        return dn;
    }
}