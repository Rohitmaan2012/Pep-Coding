import java.util.Scanner;
public class l_003_anybasetoanybase {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int decimal = anyBaseToDecimal(n1, b1);
        int dn = decimalToAnyBase(decimal,b2);
        System.out.println(dn);
    }
    public static int anyBaseToDecimal(int n, int b) {
        int p = 1;
        int rv = 0;
        while(n!=0) {
            int digit = n%10;
            rv += digit*p;
            p = p*b;
            n/=10;
        }
        return rv;
    }
    public static int decimalToAnyBase(int n, int b) {
        int p = 1;
        int rv = 0;
        while(n!=0) {
            int digit = n%b;
            rv += digit*p;
            p = p*10;
            n/=b;
        }
        return rv;
    }
}

