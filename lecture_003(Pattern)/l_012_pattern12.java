import java.util.Scanner;
public class l_012_pattern12 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        //rajneeshPattern8(n);
        sumeetPattern8(n);
    }

    /*public static void rajneeshPattern8(int n) {
        int nst = 1;
        int nsp = n-1;
        for(int r=1; r<=n; r++) {
            for(int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            for(int cst=1; cst<=nst; cst++) {
                System.out.print("*");
            }
            nsp--;
            System.out.println();
        }
    }*/

    public static void sumeetPattern8(int n) {
        for(int r=1; r<=n; r++) {
            for(int cst=1; cst<=n; cst++) {
                if(r+cst==n+1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" "); 
            }
            System.out.println();
        }
    }
}