import java.util.Scanner;
public class l_016_pattern16 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        rajneeshPattern16(n);
    }
    public static void rajneeshPattern16(int n) {
        int nst = 1;
        int nsp = 2*n-3;      // n+1 is a not the correct initial value 
        for(int r=1; r<=n; r++) {
            int val = 1;
            for(int cst=1; cst<=nst; cst++) {
                System.out.print(val);
                val++;
            }
            for(int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            if(r==n) {
                nst--;
                val--;
            }
            for(int cst=1; cst<=nst; cst++) {
                val--;
                System.out.print(val);
            }
            nst++;
            nsp-=2;
            System.out.println();
        }
    }
}