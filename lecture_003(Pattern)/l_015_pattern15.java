import java.util.Scanner;
public class l_015_pattern15 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        rajneeshPattern6(n);
        //sumeetPattern6(n);
    }
    public static void rajneeshPattern6(int n) {
        int nst = n/2+1;
        int nsp = 1;
        
        for (int r=1; r<=n; r++) {
            for(int cst=1; cst<=nst; cst++) {
            	System.out.print("*");
            }
            for(int csp=1; csp<=nsp; csp++) {
            	System.out.print(" ");
            }
            for (int cst=1; cst<=nst; cst++) {
                System.out.print("*");
            }
            if(r<=n/2) {
            	nst--;
            	nsp+=2;
            }
            else {
            	nst++;
            	nsp-=2;
            }
            System.out.println();
        }
    }
    /*public static void sumeetPattern6(int n) {
        int nst = n/2+1;
        int nsp = 1;
        
        for (int r=1; r<=n; r++) {
            for(int cst=1; cst<=nst; cst++) {
            	System.out.print("*");
            }
            for(int csp=1; csp<=nsp; csp++) {
            	System.out.print(" ");
            }
            for (int cst=1; cst<=nst; cst++) {
                System.out.print("*");
            }
            if(r<=n/2) {
            	nst--;
            	nsp+=2;
            }
            else {
            	nst++;
            	nsp-=2;
            }
            System.out.println();
        }
    }*/
}