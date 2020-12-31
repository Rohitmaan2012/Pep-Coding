import java.util.Scanner;
public class l_005_pattern5 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        patternDiamondNumber(n);
    }
    public static void patternDiamondNumber(int n) {
        int nst=1;
        int nsp=n/2;
        for (int r=1; r<=n; r++) {
            for (int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            int val = r;
            for (int cst=1; cst<=nst; cst++) {
                System.out.print(val);
            }
            if(r <= n/2) {
                nst+=2;
                nsp--;
            }
            else {
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
    }
}