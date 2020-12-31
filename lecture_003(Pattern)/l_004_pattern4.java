import java.util.Scanner;
public class l_004_pattern4 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        patternDiamond(n);
    }
    public static void patternDiamond(int n) {
        int nst=1;
        int nsp=n/2;
        for (int r=1; r<=n; r++) {
            for (int csp=1; csp<=nsp; csp++) {
                System.out.print("-");
            }
            for (int cst=1; cst<=nst; cst++) {
                System.out.print("*");
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