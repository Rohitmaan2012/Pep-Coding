import java.util.Scanner;
public class l_011_pattern11 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        //rajneeshPattern7(n);
        sumeetPattern7(n);
    }

    /*public static void rajneeshPattern7(int n) {
        int nst = 1;
        int nsp = 0;
        for(int r=1; r<=n; r++) {
            for(int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            for(int cst=1; cst<=nst; cst++) {
                System.out.print("*");
            }
            nsp++;
            System.out.println();
        }
    }*/

    public static void sumeetPattern7(int n) {
        for(int r=1; r<=n; r++) {
            for(int cst=1; cst<=r; cst++) {
                if(r==cst) {
                    System.out.print("*");
                }
                else
                    System.out.print(" "); 
            }
            System.out.println();
        }
    }
}