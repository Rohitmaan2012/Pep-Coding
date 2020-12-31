import java.util.Scanner;
public class l_018_pattern18 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        rajneeshPattern18(n);
    }
    public static void rajneeshPattern18(int n) {
        int nst = n;
        int nsp = 0;
        for(int r=1; r<=n; r++) {
            for(int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            for(int cst=1; cst<=nst; cst++) {
                if(r<=n/2 && r>1 && cst>1 && cst<nst) {
                        System.out.print(" ");
                }
                else
                System.out.print("*");
            }
            if(r<=n/2) {
                nst-=2;
                nsp++;
            }
            else {
                nst+=2;
                nsp--;
            }
            System.out.println();
        }
    }
}