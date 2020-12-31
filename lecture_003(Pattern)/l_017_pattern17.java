import java.util.Scanner;
public class l_017_pattern17 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        rajneeshPattern17(n);
    }
    public static void rajneeshPattern17(int n) {
        int nst = 1;
        int nsp = n/2;
        for(int r=1; r<=n; r++) {
            for(int csp=1; csp<=nsp; csp++) {
                if(r == n/2+1) {
                    System.out.print("*");
                }
                else {
                System.out.print(" ");
                }
            }
            for(int cst=1; cst<=nst; cst++) {
                System.out.print("*");
            }
            if(r<=n/2) {
                nst++;
            }
            else {
                nst--;
            }
            System.out.println();
        }
    }
}