import java.util.Scanner;
public class l_007_pattern7 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        patternDiamondNumber2(n);
    }
    public static void patternDiamondNumber2(int n) {
        int nst=1;
        int nsp=n/2;
        int num = 0;
        for (int r=1; r<=n; r++) {
            for (int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            for (int cst=1; cst<=nst; cst++) {
                num++;
                System.out.print(num);
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